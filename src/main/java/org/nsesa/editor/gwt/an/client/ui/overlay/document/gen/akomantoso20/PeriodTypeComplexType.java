package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class PeriodTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public PeriodTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType periodAttr;
    private String wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;

    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
        }

        return periodAttr;
    }
    //DSL Style get value
    public AnyURISimpleType periodAttr() {
         return  getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    //DSL Style set value
    public PeriodTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    //DSL Style get value
    public String wildcardContentAttr() {
         return  getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    //DSL Style set value
    public PeriodTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    //DSL Style get value
    public IDSimpleType idAttr() {
         return  getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    //DSL Style set value
    public PeriodTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    //DSL Style get value
    public NMTOKENSimpleType evolvingIdAttr() {
         return  getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    //DSL Style set value
    public PeriodTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("periodAttr", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        attrs.put("wildcardContentAttr", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("idAttr", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingIdAttr", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        return attrs;
    }

}

