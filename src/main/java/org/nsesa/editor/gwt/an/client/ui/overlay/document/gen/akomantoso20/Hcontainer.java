package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Hcontainer extends HierarchyComplexType  {

// CONSTRUCTORS ------------------
    public Hcontainer() {
        super(DOM.createElement("hcontainer"));
    }

    public Hcontainer(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType nameAttr;
    public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
            nameAttr = new StringSimpleType();
            nameAttr.setValue(amendableElement.getAttribute("name"));
        }

        return nameAttr;
    }
    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tome","subparagraph","paragraph","subheading","subsection","title","chapter","division","alinea","componentRef","subchapter","wrap","indent","subclause","list","sublist","section","intro","content","point","num","article","subpart","hcontainer","book","subtitle","part","heading","clause"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("nameAttr", getNameAttr() != null ? getNameAttr().getValue() : null);
        return attrs;
    }

}

