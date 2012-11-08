package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ScopeModsSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Domain;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ScopeMod extends ModificationTypeComplexType  {

// CONSTRUCTORS ------------------
public ScopeMod(Element element) {
    super(element);
}

// FIELDS ------------------
private ScopeModsSimpleType typez;
private Domain domain;

public ScopeModsSimpleType getTypez() {
return typez;
}

public void setTypez(final ScopeModsSimpleType typez) {
this.typez = typez;
}
public Domain getDomain() {
return domain;
}

public void setDomain(final Domain domain) {
this.domain = domain;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"application","ScopeModsSimpleType","modifiersAttrGroup","coreAttrGroup","condition","idreqAttrGroup","efficacy","destination","duration","source","domain","enactmentAttrGroup","force","refersAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

