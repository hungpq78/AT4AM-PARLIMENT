package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRthis;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRuri;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRalias;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRdate;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.FRBRauthor;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ComponentInfo;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Preservation;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class CorePropertiesComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public CorePropertiesComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    public FRBRthis getFRBRthis() {
        FRBRthis result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRthis".equalsIgnoreCase(widget.getType())) {
                result = (FRBRthis)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRthis setFRBRthis(FRBRthis FRBRthisElem) {
        FRBRthis result = getFRBRthis();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRthisElem);

        return FRBRthisElem;
    }
    public java.util.List<FRBRuri> getFRBRuris() {
        java.util.List<FRBRuri> result = new ArrayList<FRBRuri>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRuri".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRuri)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<FRBRuri> getFRBRuriList() {
        return  getFRBRuris();
    }
    //DSL Style set value
    public FRBRuri addFRBRuri(FRBRuri FRBRuriElem) {
        this.addAmendableWidget(FRBRuriElem);
        return FRBRuriElem;
    }

    public java.util.List<FRBRalias> getFRBRaliases() {
        java.util.List<FRBRalias> result = new ArrayList<FRBRalias>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRalias".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRalias)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<FRBRalias> getFRBRaliasList() {
        return  getFRBRaliases();
    }
    //DSL Style set value
    public FRBRalias addFRBRalias(FRBRalias FRBRaliasElem) {
        this.addAmendableWidget(FRBRaliasElem);
        return FRBRaliasElem;
    }

    public java.util.List<FRBRdate> getFRBRdates() {
        java.util.List<FRBRdate> result = new ArrayList<FRBRdate>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRdate".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRdate)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<FRBRdate> getFRBRdateList() {
        return  getFRBRdates();
    }
    //DSL Style set value
    public FRBRdate addFRBRdate(FRBRdate FRBRdateElem) {
        this.addAmendableWidget(FRBRdateElem);
        return FRBRdateElem;
    }

    public java.util.List<FRBRauthor> getFRBRauthors() {
        java.util.List<FRBRauthor> result = new ArrayList<FRBRauthor>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRauthor".equalsIgnoreCase(widget.getType())) {
                result.add((FRBRauthor)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<FRBRauthor> getFRBRauthorList() {
        return  getFRBRauthors();
    }
    //DSL Style set value
    public FRBRauthor addFRBRauthor(FRBRauthor FRBRauthorElem) {
        this.addAmendableWidget(FRBRauthorElem);
        return FRBRauthorElem;
    }

    public ComponentInfo getComponentInfo() {
        ComponentInfo result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentInfo".equalsIgnoreCase(widget.getType())) {
                result = (ComponentInfo)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public ComponentInfo setComponentInfo(ComponentInfo componentInfoElem) {
        ComponentInfo result = getComponentInfo();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(componentInfoElem);

        return componentInfoElem;
    }
    public Preservation getPreservation() {
        Preservation result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Preservation".equalsIgnoreCase(widget.getType())) {
                result = (Preservation)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Preservation setPreservation(Preservation preservationElem) {
        Preservation result = getPreservation();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(preservationElem);

        return preservationElem;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"FRBRthis","FRBRalias","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

