package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlineComplexType;
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
public class Vote extends InlineComplexType  {

// CONSTRUCTORS ------------------
    public Vote() {
        super(DOM.createElement("vote"));
    }

    public Vote(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType byAttr;
    private AnyURISimpleType asAttr;
    private AnyURISimpleType choiceAttr;

    public AnyURISimpleType getByAttr() {
        if (byAttr == null) {
            byAttr = new AnyURISimpleType();
            byAttr.setValue(amendableElement.getAttribute("by"));
        }

        return byAttr;
    }
    //DSL Style get value
    public AnyURISimpleType byAttr() {
         return  getByAttr();
    }

    public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
    }
    //DSL Style set value
    public Vote byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
    }
    public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
            asAttr = new AnyURISimpleType();
            asAttr.setValue(amendableElement.getAttribute("as"));
        }

        return asAttr;
    }
    //DSL Style get value
    public AnyURISimpleType asAttr() {
         return  getAsAttr();
    }

    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }
    //DSL Style set value
    public Vote asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
    }
    public AnyURISimpleType getChoiceAttr() {
        if (choiceAttr == null) {
            choiceAttr = new AnyURISimpleType();
            choiceAttr.setValue(amendableElement.getAttribute("choice"));
        }

        return choiceAttr;
    }
    //DSL Style get value
    public AnyURISimpleType choiceAttr() {
         return  getChoiceAttr();
    }

    public void setChoiceAttr(final AnyURISimpleType choiceAttr) {
        this.choiceAttr = choiceAttr;
    }
    //DSL Style set value
    public Vote choiceAttr(final AnyURISimpleType choiceAttr) {
        setChoiceAttr(choiceAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("byAttr", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("asAttr", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("choiceAttr", getChoiceAttr() != null ? getChoiceAttr().getValue() : null);
        return attrs;
    }

}

