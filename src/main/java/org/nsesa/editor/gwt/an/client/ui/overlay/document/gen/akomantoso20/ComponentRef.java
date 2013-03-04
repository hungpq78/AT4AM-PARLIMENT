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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * the element componentRef is a manifestation-level reference to a separate resource that holds the content of the component of the document not physically placed at the position specified. Actual resources can either be external (e.g. in the package or even in a different position) or internal (within the components element)
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class ComponentRef extends SrcTypeComplexType {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "componentRef");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget componentRef");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>ComponentRef</code> object and set up its type
     */
    public ComponentRef() {
        super(create());
        setType("componentRef");
    }

    /**
     * Constructor with required attributes
     */
    public ComponentRef(AnyURISimpleType srcAttr, StringSimpleType showAsAttr) {
        this();
        setSrcAttr(srcAttr);
        setShowAsAttr(showAsAttr);
    }


    /**
     * Create a <code>ComponentRef</code> object with the given DOM element
     */
    public ComponentRef(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>srcAttr</code> property in DSL way
     *
     * @param srcAttr new value
     * @return <code> ComponentRef</code> instance
     */
    public ComponentRef srcAttr(final AnyURISimpleType srcAttr) {
        setSrcAttr(srcAttr);
        return this;
    }

    /**
     * Set <code>altAttr</code> property in DSL way
     *
     * @param altAttr new value
     * @return <code> ComponentRef</code> instance
     */
    public ComponentRef altAttr(final StringSimpleType altAttr) {
        setAltAttr(altAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> ComponentRef</code> instance
     */
    public ComponentRef idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> ComponentRef</code> instance
     */
    public ComponentRef evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>showAsAttr</code> property in DSL way
     *
     * @param showAsAttr new value
     * @return <code> ComponentRef</code> instance
     */
    public ComponentRef showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }

    /**
     * Set <code>shortFormAttr</code> property in DSL way
     *
     * @param shortFormAttr new value
     * @return <code> ComponentRef</code> instance
     */
    public ComponentRef shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> ComponentRef</code> instance
     */
    public ComponentRef wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

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
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public ComponentRef html(String s) {
        super.html(s);
        return this;
    }
}

