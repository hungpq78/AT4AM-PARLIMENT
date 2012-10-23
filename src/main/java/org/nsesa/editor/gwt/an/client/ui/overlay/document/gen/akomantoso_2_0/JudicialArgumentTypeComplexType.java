package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EnactmentAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModifiersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Condition;
import org.nsesa.editor.gwt.core.client.ui.overlay.xml.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.EnactmentAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModifiersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Source;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Destination;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Condition;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class JudicialArgumentTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public JudicialArgumentTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private EnactmentAttrGroup enactment;
private RefersAttrGroup refers;
private CoreAttrGroup core;
private IdreqAttrGroup idreq;
private ModifiersAttrGroup modifiers;
private java.util.List<Source> sources = new ArrayList<Source>();
private java.util.List<Destination> destinations = new ArrayList<Destination>();
private Condition condition;

public EnactmentAttrGroup getEnactment() {
return enactment;
}

public void setEnactment(final EnactmentAttrGroup enactment) {
this.enactment = enactment;
}

public RefersAttrGroup getRefers() {
return refers;
}

public void setRefers(final RefersAttrGroup refers) {
this.refers = refers;
}

public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}

public IdreqAttrGroup getIdreq() {
return idreq;
}

public void setIdreq(final IdreqAttrGroup idreq) {
this.idreq = idreq;
}

public ModifiersAttrGroup getModifiers() {
return modifiers;
}

public void setModifiers(final ModifiersAttrGroup modifiers) {
this.modifiers = modifiers;
}

public java.util.List<Source> getSource() {
return sources;
}

public void setSource(final java.util.List<Source> sources) {
this.sources = sources;
}

public java.util.List<Destination> getDestination() {
return destinations;
}

public void setDestination(final java.util.List<Destination> destinations) {
this.destinations = destinations;
}

public Condition getCondition() {
return condition;
}

public void setCondition(final Condition condition) {
this.condition = condition;
}

}

