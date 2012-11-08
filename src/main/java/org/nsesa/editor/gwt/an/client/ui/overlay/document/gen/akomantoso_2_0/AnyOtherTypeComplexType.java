package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkoptAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class AnyOtherTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public AnyOtherTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private IdoptAttrGroup idopt;
private CoreAttrGroup core;
private LinkoptAttrGroup linkopt;
private java.util.List<AmendableWidgetImpl> wildcardContents = new ArrayList<AmendableWidgetImpl>();

public IdoptAttrGroup getIdopt() {
return idopt;
}

public void setIdopt(final IdoptAttrGroup idopt) {
this.idopt = idopt;
}
public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}
public LinkoptAttrGroup getLinkopt() {
return linkopt;
}

public void setLinkopt(final LinkoptAttrGroup linkopt) {
this.linkopt = linkopt;
}
public java.util.List<AmendableWidgetImpl> getWildcardContent() {
return wildcardContents;
}

public void setWildcardContent(final java.util.List<AmendableWidgetImpl> wildcardContents) {
this.wildcardContents = wildcardContents;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","*","linkoptAttrGroup","idoptAttrGroup"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

