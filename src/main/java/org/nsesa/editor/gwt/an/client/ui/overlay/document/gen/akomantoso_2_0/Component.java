package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DocumentTypeGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Component extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public Component(Element element) {
    super(element);
}

// FIELDS ------------------
private IdreqAttrGroup idreq;
private CoreAttrGroup core;
private DocumentTypeGroup documentType;

public IdreqAttrGroup getIdreq() {
return idreq;
}

public void setIdreq(final IdreqAttrGroup idreq) {
this.idreq = idreq;
}
public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}
public DocumentTypeGroup getDocumentType() {
return documentType;
}

public void setDocumentType(final DocumentTypeGroup documentType) {
this.documentType = documentType;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","idreqAttrGroup","documentTypeGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

