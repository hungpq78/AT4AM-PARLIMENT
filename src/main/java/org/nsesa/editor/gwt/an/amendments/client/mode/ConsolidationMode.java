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
package org.nsesa.editor.gwt.an.amendments.client.mode;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtoso20AmendmentControllerUtil;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.amendment.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.event.NotificationEvent;
import org.nsesa.editor.gwt.core.client.mode.ActiveState;
import org.nsesa.editor.gwt.core.client.mode.DocumentMode;
import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;

/**
 * Date: 26/11/12 14:11
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class ConsolidationMode implements DocumentMode<ActiveState> {

    public static final String KEY = "consolidation";

    private final DocumentController documentController;
    private final ClientFactory clientFactory;

    private ActiveState state = new ActiveState(false);

    public ConsolidationMode(DocumentController documentController, ClientFactory clientFactory) {
        this.documentController = documentController;
        this.clientFactory = clientFactory;
    }

    @Override
    public boolean apply(ActiveState state) {
        if (state.isActive()) {
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Consolidation view is now active."));
            documentController.getSourceFileController().walk(new OverlayWidgetWalker.OverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {

                        final com.google.gwt.user.client.Element div = DOM.createDiv();
                        div.addClassName("temporaryForConsolidation");
                        visited.getParentOverlayWidget().getOverlayElement().insertBefore(div, visited.getOverlayElement());
                        int i = 1;
                        for (final AmendmentController amendmentController : visited.getAmendmentControllers()) {
                            final String amendmentContentFromModel = AkomaNtoso20AmendmentControllerUtil.getAmendmentContentFromModel(amendmentController);
                            final com.google.gwt.user.client.Element span = DOM.createSpan();
                            span.setInnerHTML(amendmentContentFromModel);
                            final Element childElement = span.getFirstChildElement();
                            childElement.getStyle().setColor("blue");
                            // insert a separator if there are more than 1 amendment controller or this element
                            if (i > 1) {
                                div.appendChild(new HTML("<br/><br/><div style='width:100%;text-align:center;'><h2>- OR -</h2></div>").getElement());
                            }
                            div.appendChild(childElement);
                            visited.asWidget().setVisible(false);
                            i++;
                        }
                    }
                    return true;
                }
            });
        } else {
            clientFactory.getEventBus().fireEvent(new NotificationEvent("Consolidation view is now inactive."));
            documentController.getSourceFileController().walk(new OverlayWidgetWalker.OverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.isAmended()) {
                        final NodeList<Node> childNodes = visited.getParentOverlayWidget().getOverlayElement().getChildNodes();
                        for (int i = 0; i < childNodes.getLength(); i++) {
                            Node node = childNodes.getItem(i);
                            if (Node.ELEMENT_NODE == node.getNodeType()) {
                                Element element = Element.as(node);
                                if (element.getClassName().contains("temporaryForConsolidation")) {
                                    element.removeFromParent();
                                }
                            }
                        }
                        visited.asWidget().setVisible(true);
                    }
                    return true;
                }
            });
        }
        this.state = state;
        return true;
    }


    @Override
    public ActiveState getState() {
        return state;
    }
}