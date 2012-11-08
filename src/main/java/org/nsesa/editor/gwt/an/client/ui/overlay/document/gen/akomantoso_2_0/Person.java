package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlinereqreqComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Person extends InlinereqreqComplexType  {

// CONSTRUCTORS ------------------
public Person(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType as;

public AnyURISimpleType getAs() {
return as;
}

public void setAs(final AnyURISimpleType as) {
this.as = as;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","anyURISimpleType","corereqreqAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

