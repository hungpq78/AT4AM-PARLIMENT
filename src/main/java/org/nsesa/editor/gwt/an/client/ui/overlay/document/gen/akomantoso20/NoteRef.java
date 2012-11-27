package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PlacementTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class NoteRef extends MarkeroptComplexType  {

// CONSTRUCTORS ------------------
    public NoteRef() {
        super(DOM.createElement("noteRef"));
    }

    public NoteRef(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType markerAttr;
    private PlacementTypeSimpleType placementAttr;
    private AnyURISimpleType placementBaseAttr;
    private AnyURISimpleType hrefAttr;

    public StringSimpleType getMarkerAttr() {
        if (markerAttr == null) {
            markerAttr = new StringSimpleType();
            markerAttr.setValue(amendableElement.getAttribute("marker"));
        }

        return markerAttr;
    }
    //DSL Style get value
    public StringSimpleType markerAttr() {
         return  getMarkerAttr();
    }

    public void setMarkerAttr(final StringSimpleType markerAttr) {
        this.markerAttr = markerAttr;
    }
    //DSL Style set value
    public NoteRef markerAttr(final StringSimpleType markerAttr) {
        setMarkerAttr(markerAttr);
        return this;
    }
    public PlacementTypeSimpleType getPlacementAttr() {
        if (placementAttr == null) {
            placementAttr = PlacementTypeSimpleType.fromString(amendableElement.getAttribute("placement"));
        }

        return placementAttr;
    }
    //DSL Style get value
    public PlacementTypeSimpleType placementAttr() {
         return  getPlacementAttr();
    }

    public void setPlacementAttr(final PlacementTypeSimpleType placementAttr) {
        this.placementAttr = placementAttr;
    }
    //DSL Style set value
    public NoteRef placementAttr(final PlacementTypeSimpleType placementAttr) {
        setPlacementAttr(placementAttr);
        return this;
    }
    public AnyURISimpleType getPlacementBaseAttr() {
        if (placementBaseAttr == null) {
            placementBaseAttr = new AnyURISimpleType();
            placementBaseAttr.setValue(amendableElement.getAttribute("placementBase"));
        }

        return placementBaseAttr;
    }
    //DSL Style get value
    public AnyURISimpleType placementBaseAttr() {
         return  getPlacementBaseAttr();
    }

    public void setPlacementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        this.placementBaseAttr = placementBaseAttr;
    }
    //DSL Style set value
    public NoteRef placementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        setPlacementBaseAttr(placementBaseAttr);
        return this;
    }
    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(amendableElement.getAttribute("href"));
        }

        return hrefAttr;
    }
    //DSL Style get value
    public AnyURISimpleType hrefAttr() {
         return  getHrefAttr();
    }

    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
    //DSL Style set value
    public NoteRef hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("markerAttr", getMarkerAttr() != null ? getMarkerAttr().getValue() : null);
        attrs.put("placementAttr", getPlacementAttr() != null ? getPlacementAttr().value() : null);
        attrs.put("placementBaseAttr", getPlacementBaseAttr() != null ? getPlacementBaseAttr().getValue() : null);
        attrs.put("hrefAttr", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        return attrs;
    }

}
