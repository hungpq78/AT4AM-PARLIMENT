/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Generated class
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Lifecycle extends OverlayWidgetImpl {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new EventRef(), new Occurrence(1, -1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "lifecycle");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget lifecycle");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Lifecycle</code> object and set up its type
     */
    public Lifecycle() {
        super(create());
        setType("lifecycle");
    }

    /**
     * Constructor with required attributes
     */
    public Lifecycle(AnyURISimpleType sourceAttr) {
        this();
        setSourceAttr(sourceAttr);
    }


    /**
     * Create a <code>Lifecycle</code> object with the given DOM element
     */
    public Lifecycle(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    /**
     * Return <code>java.util.List<EventRef></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<EventRef> getEventRefs() {
        java.util.List<EventRef> result = new ArrayList<EventRef>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("EventRef".equalsIgnoreCase(widget.getType())) {
                result.add((EventRef) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<EventRef></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<EventRef> getEventRefList() {
        return getEventRefs();
    }

    /**
     * Add <code>java.util.List<EventRef></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public EventRef addEventRef(EventRef eventRefElem) {
        this.addOverlayWidget(eventRefElem);
        return eventRefElem;
    }

    /**
     * Return <code>sourceAttr</code> property
     *
     * @return sourceAttr
     */
    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
    }

    /**
     * Return <code>sourceAttr</code> property in DSL way
     *
     * @return sourceAttr
     */
    public AnyURISimpleType sourceAttr() {
        return getSourceAttr();
    }

    /**
     * Set <code>sourceAttr</code> property
     *
     * @param sourceAttr the new value
     */
    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
        getElement().setAttribute("source", sourceAttr.getValue());
    }

    /**
     * Set <code>sourceAttr</code> property in DSL way
     *
     * @param sourceAttr the new value
     * @return <code>Lifecycle</code> instance
     */
    public Lifecycle sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
    }

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public Lifecycle html(String s) {
        super.html(s);
        return this;
    }
}

