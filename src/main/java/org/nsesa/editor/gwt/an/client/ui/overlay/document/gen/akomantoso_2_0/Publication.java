package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NameAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NumberAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ShowAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DateAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Publication extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
public Publication(Element element) {
    super(element);
}

// FIELDS ------------------
private NameAttrGroup name;
private RefersAttrGroup refers;
private NumberAttrGroup number;
private ShowAttrGroup show;
private DateAttrGroup date;

public NameAttrGroup getName() {
return name;
}

public void setName(final NameAttrGroup name) {
this.name = name;
}
public RefersAttrGroup getRefers() {
return refers;
}

public void setRefers(final RefersAttrGroup refers) {
this.refers = refers;
}
public NumberAttrGroup getNumber() {
return number;
}

public void setNumber(final NumberAttrGroup number) {
this.number = number;
}
public ShowAttrGroup getShow() {
return show;
}

public void setShow(final ShowAttrGroup show) {
this.show = show;
}
public DateAttrGroup getDate() {
return date;
}

public void setDate(final DateAttrGroup date) {
this.date = date;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","nameAttrGroup","showAttrGroup","idoptAttrGroup","numberAttrGroup","dateAttrGroup","refersAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

