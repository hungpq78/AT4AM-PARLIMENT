package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Step;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Workflow extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Workflow() {
        super(DOM.createElement("workflow"));
    }

    public Workflow(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    public java.util.List<Step> getSteps() {
        java.util.List<Step> result = new ArrayList<Step>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Step".equalsIgnoreCase(widget.getType())) {
                result.add((Step)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Step> getStepList() {
        return  getSteps();
    }
    //DSL Style set value
    public Step addStep(Step stepElem) {
        this.addAmendableWidget(stepElem);
        return stepElem;
    }

    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(amendableElement.getAttribute("source"));
        }

        return sourceAttr;
    }
    //DSL Style get value
    public AnyURISimpleType sourceAttr() {
         return  getSourceAttr();
    }

    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }
    //DSL Style set value
    public Workflow sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"step"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("sourceAttr", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

}
