package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlinereqreqComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Quantity extends InlinereqreqComplexType  {

// CONSTRUCTORS ------------------
public Quantity(Element element) {
    super(element);
}

// FIELDS ------------------
private StringSimpleType normalized;

public StringSimpleType getNormalized() {
return normalized;
}

public void setNormalized(final StringSimpleType normalized) {
this.normalized = normalized;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","corereqreqAttrGroup","stringSimpleType"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

