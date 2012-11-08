package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PosAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ArgumentTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ArgumentTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType upTo;
private IdoptAttrGroup idopt;
private LinkAttrGroup link;
private PosAttrGroup pos;
private CoreAttrGroup core;

public AnyURISimpleType getUpTo() {
return upTo;
}

public void setUpTo(final AnyURISimpleType upTo) {
this.upTo = upTo;
}
public IdoptAttrGroup getIdopt() {
return idopt;
}

public void setIdopt(final IdoptAttrGroup idopt) {
this.idopt = idopt;
}
public LinkAttrGroup getLink() {
return link;
}

public void setLink(final LinkAttrGroup link) {
this.link = link;
}
public PosAttrGroup getPos() {
return pos;
}

public void setPos(final PosAttrGroup pos) {
this.pos = pos;
}
public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{"coreAttrGroup","posAttrGroup","linkAttrGroup","idoptAttrGroup","anyURISimpleType"};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

