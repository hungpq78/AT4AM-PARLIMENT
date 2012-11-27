package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ReferenceTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
public class HasAttachment extends ReferenceTypeComplexType  {

// CONSTRUCTORS ------------------
    public HasAttachment() {
        super(DOM.createElement("hasAttachment"));
    }

    public HasAttachment(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType typeAttr;

    public StringSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = new StringSimpleType();
            typeAttr.setValue(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    //DSL Style get value
    public StringSimpleType typeAttr() {
         return  getTypeAttr();
    }

    public void setTypeAttr(final StringSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    //DSL Style set value
    public HasAttachment typeAttr(final StringSimpleType typeAttr) {
        setTypeAttr(typeAttr);
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
        attrs.put("typeAttr", getTypeAttr() != null ? getTypeAttr().getValue() : null);
        return attrs;
    }

}
