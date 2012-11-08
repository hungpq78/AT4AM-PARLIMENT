package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ParliamentaryAnalysisTypeComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class QuorumVerification extends ParliamentaryAnalysisTypeComplexType  {

// CONSTRUCTORS ------------------
public QuorumVerification(Element element) {
    super(element);
}

// FIELDS ------------------

/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"quorum","coreAttrGroup","count","linkoptAttrGroup","idreqAttrGroup","outcomeAttrGroup","refersAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

