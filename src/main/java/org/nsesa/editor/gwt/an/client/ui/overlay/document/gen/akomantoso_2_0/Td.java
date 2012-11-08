package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlocksoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CellattrsAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Td extends BlocksoptComplexType  {

// CONSTRUCTORS ------------------
public Td(Element element) {
    super(element);
}

// FIELDS ------------------
private CellattrsAttrGroup cellattrs;

public CellattrsAttrGroup getCellattrs() {
return cellattrs;
}

public void setCellattrs(final CellattrsAttrGroup cellattrs) {
this.cellattrs = cellattrs;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"blockElementsGroup","cellattrsAttrGroup","coreoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

