package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.OpenStructureComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Doc extends OpenStructureComplexType  {

// CONSTRUCTORS ------------------
public Doc(Element element) {
    super(element);
}

// FIELDS ------------------

/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"conclusions","preface","versionTypeSimpleType","mainBody","preamble","coverPage","nameAttrGroup","attachments","meta"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

