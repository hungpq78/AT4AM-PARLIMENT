package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.OpinionTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Opinion extends InlineComplexType  {

// CONSTRUCTORS ------------------
public Opinion(Element element) {
    super(element);
}

// FIELDS ------------------
private OpinionTypeSimpleType typez;

public OpinionTypeSimpleType getTypez() {
return typez;
}

public void setTypez(final OpinionTypeSimpleType typez) {
this.typez = typez;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"inlineCMGroup","opinionTypeSimpleType","coreoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

