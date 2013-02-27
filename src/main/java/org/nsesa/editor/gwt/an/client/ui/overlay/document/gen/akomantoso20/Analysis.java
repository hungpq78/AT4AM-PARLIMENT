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
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Analysis extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new ActiveModifications(), new Occurrence(0, 1));
            put(new PassiveModifications(), new Occurrence(0, 1));
            put(new Judicial(), new Occurrence(0, 1));
            put(new Parliamentary(), new Occurrence(0, 1));
            put(new OtherAnalysis(), new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "analysis");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget analysis");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Analysis() {
        super(create());
        setType("analysis");
    }

    //Constructor with the required attributes
    public Analysis(AnyURISimpleType sourceAttr) {
        this();
        setSourceAttr(sourceAttr);
    }


    public Analysis(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    public ActiveModifications getActiveModifications() {
        ActiveModifications result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("ActiveModifications".equalsIgnoreCase(widget.getType())) {
                result = (ActiveModifications) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public ActiveModifications setActiveModifications(ActiveModifications activeModificationsElem) {
        ActiveModifications result = getActiveModifications();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(activeModificationsElem);

        return activeModificationsElem;
    }

    public PassiveModifications getPassiveModifications() {
        PassiveModifications result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("PassiveModifications".equalsIgnoreCase(widget.getType())) {
                result = (PassiveModifications) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public PassiveModifications setPassiveModifications(PassiveModifications passiveModificationsElem) {
        PassiveModifications result = getPassiveModifications();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(passiveModificationsElem);

        return passiveModificationsElem;
    }

    public Judicial getJudicial() {
        Judicial result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Judicial".equalsIgnoreCase(widget.getType())) {
                result = (Judicial) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Judicial setJudicial(Judicial judicialElem) {
        Judicial result = getJudicial();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(judicialElem);

        return judicialElem;
    }

    public Parliamentary getParliamentary() {
        Parliamentary result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Parliamentary".equalsIgnoreCase(widget.getType())) {
                result = (Parliamentary) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Parliamentary setParliamentary(Parliamentary parliamentaryElem) {
        Parliamentary result = getParliamentary();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(parliamentaryElem);

        return parliamentaryElem;
    }

    public java.util.List<OtherAnalysis> getOtherAnalysises() {
        java.util.List<OtherAnalysis> result = new ArrayList<OtherAnalysis>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("OtherAnalysis".equalsIgnoreCase(widget.getType())) {
                result.add((OtherAnalysis) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<OtherAnalysis> getOtherAnalysisList() {
        return getOtherAnalysises();
    }

    //DSL Style set value
    public OtherAnalysis addOtherAnalysis(OtherAnalysis otherAnalysisElem) {
        this.addOverlayWidget(otherAnalysisElem);
        return otherAnalysisElem;
    }

    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
    }

    //DSL Style get value
    public AnyURISimpleType sourceAttr() {
        return getSourceAttr();
    }

    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source", sourceAttr.getValue());
    }

    //DSL Style set value
    public Analysis sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
    }

    /**
     * Returns the namespace URI of this amendable widget.
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

    //DSL Style for html method
    @Override
    public Analysis html(String s) {
        super.html(s);
        return this;
    }
}

