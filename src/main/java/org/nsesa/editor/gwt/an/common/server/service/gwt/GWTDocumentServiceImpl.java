/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.server.service.gwt;

import freemarker.ext.dom.NodeModel;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTDocumentService;
import org.nsesa.editor.gwt.core.shared.ClientContext;
import org.nsesa.editor.gwt.core.shared.DocumentDTO;
import org.nsesa.server.service.api.DocumentService;
import org.springframework.core.io.Resource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Date: 24/06/12 19:57
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class GWTDocumentServiceImpl extends SpringRemoteServiceServlet implements GWTDocumentService {

    private DocumentService documentService;

    private Resource documentTemplate;

    @Override
    public HashMap<String, String> getMetaInformation(final ClientContext clientContext, final String documentID) {
        return null;
    }

    @Override
    public DocumentDTO getDocument(final ClientContext clientContext, final String documentID) {
        final org.nsesa.server.dto.DocumentDTO fromServices = documentService.getDocument(documentID);

        if (fromServices != null) {
            // manually copy for now
            final DocumentDTO document = new DocumentDTO();
            document.setDocumentID(fromServices.getDocumentID());
            document.setAmendable(fromServices.isAmendable());
            document.setName(fromServices.getName());
            document.setLanguageIso(fromServices.getLanguageIso());
            document.setDeadline(new Date(fromServices.getDeadline().getTime().getTime()));

            return document;
        }
        return null;
    }

    @Override
    public String getDocumentFragment(final ClientContext clientContext, final String documentID, final String elementID) {
        return null;
    }

    @Override
    public ArrayList<DocumentDTO> getAvailableTranslations(final ClientContext clientContext, final String documentID) {
        ArrayList<DocumentDTO> translations = new ArrayList<DocumentDTO>();

        final DocumentDTO documentDTO1 = new DocumentDTO();
        documentDTO1.setLanguageIso("EN");
        documentDTO1.setName("English");
        documentDTO1.setDocumentID("1");
        translations.add(documentDTO1);

        final DocumentDTO documentDTO2 = new DocumentDTO();
        documentDTO2.setLanguageIso("FR");
        documentDTO2.setName("French");
        documentDTO2.setDocumentID("2");
        translations.add(documentDTO2);

        final DocumentDTO documentDTO3 = new DocumentDTO();
        documentDTO3.setLanguageIso("DE");
        documentDTO3.setName("German");
        documentDTO3.setDocumentID("3");
        translations.add(documentDTO3);

        return translations;
    }

    @Override
    public ArrayList<DocumentDTO> getRelatedDocuments(ClientContext clientContext, String documentID) {
        ArrayList<DocumentDTO> related = new ArrayList<DocumentDTO>();

        final DocumentDTO documentDTO1 = new DocumentDTO();
        documentDTO1.setLanguageIso("EN");
        documentDTO1.setName("Related 1");
        documentDTO1.setDocumentID("4");
        related.add(documentDTO1);

        final DocumentDTO documentDTO2 = new DocumentDTO();
        documentDTO2.setLanguageIso("EN");
        documentDTO2.setName("Related 2");
        documentDTO2.setDocumentID("5");
        related.add(documentDTO2);

        return related;
    }

    @Override
    public String getDocumentContent(final ClientContext clientContext, final String documentID) {
        String content = documentService.getDocumentContent(documentID);

        final InputSource inputSource;
        if (content != null) {
            byte[] bytes = content.getBytes(Charset.forName("UTF-8"));
            inputSource = new InputSource(new ByteArrayInputStream(bytes));
        } else {
            inputSource = new InputSource(documentID);
        }

        try {
            final NodeModel model = NodeModel.parse(inputSource);
            final Configuration configuration = new Configuration();
            configuration.setDefaultEncoding("UTF-8");
            configuration.setDirectoryForTemplateLoading(documentTemplate.getFile().getParentFile());
            final StringWriter sw = new StringWriter();
            Map<String, Object> root = new HashMap<String, Object>();
            root.put("doc", model);
            configuration.getTemplate(documentTemplate.getFile().getName()).process(root, sw);
            return sw.toString();

        } catch (IOException e) {
            throw new RuntimeException("Could not read file.", e);
        } catch (SAXException e) {
            throw new RuntimeException("Could not parse file.", e);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("Could not parse file.", e);
        } catch (TemplateException e) {
            throw new RuntimeException("Could not load template.", e);
        }
    }

    // Spring setters ----------------------

    public void setDocumentTemplate(Resource documentTemplate) {
        this.documentTemplate = documentTemplate;
    }

    public void setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }
}