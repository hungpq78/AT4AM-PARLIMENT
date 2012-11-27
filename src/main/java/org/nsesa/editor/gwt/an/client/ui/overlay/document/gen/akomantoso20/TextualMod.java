package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.TextualModsSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Old;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.New;
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
public class TextualMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
    public TextualMod() {
        super(DOM.createElement("textualMod"));
    }

    public TextualMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private TextualModsSimpleType typeAttr;

    public TextualModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = TextualModsSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    //DSL Style get value
    public TextualModsSimpleType typeAttr() {
         return  getTypeAttr();
    }

    public void setTypeAttr(final TextualModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    //DSL Style set value
    public TextualMod typeAttr(final TextualModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }
    public Old getOld() {
        Old result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Old".equalsIgnoreCase(widget.getType())) {
                result = (Old)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Old setOld(Old oldElem) {
        Old result = getOld();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(oldElem);

        return oldElem;
    }
    public New getNew() {
        New result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("New".equalsIgnoreCase(widget.getType())) {
                result = (New)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public New setNew(New newElem) {
        New result = getNew();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(newElem);

        return newElem;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","new","old","source","condition","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }

}
