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
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.HierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NCNameSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* this element is a hierarchical container called "subparagraph" either explicitly or due to the local tradition
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Subparagraph extends HierarchyComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Intro())
,        new StructureIndicator.DefaultChoice(0,-1,        new StructureIndicator.DefaultElement(1,1,new ComponentRef())
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Clause())
,        new StructureIndicator.DefaultElement(1,1,new Section())
,        new StructureIndicator.DefaultElement(1,1,new Part())
,        new StructureIndicator.DefaultElement(1,1,new Paragraph())
,        new StructureIndicator.DefaultElement(1,1,new Chapter())
,        new StructureIndicator.DefaultElement(1,1,new Title())
,        new StructureIndicator.DefaultElement(1,1,new Article())
,        new StructureIndicator.DefaultElement(1,1,new Book())
,        new StructureIndicator.DefaultElement(1,1,new Tome())
,        new StructureIndicator.DefaultElement(1,1,new Division())
,        new StructureIndicator.DefaultElement(1,1,new List())
,        new StructureIndicator.DefaultElement(1,1,new Point())
,        new StructureIndicator.DefaultElement(1,1,new Indent())
,        new StructureIndicator.DefaultElement(1,1,new Alinea())
,        new StructureIndicator.DefaultElement(1,1,new Subsection())
,        new StructureIndicator.DefaultElement(1,1,new Subpart())
,        new StructureIndicator.DefaultElement(1,1,new Subparagraph())
,        new StructureIndicator.DefaultElement(1,1,new Subchapter())
,        new StructureIndicator.DefaultElement(1,1,new Subtitle())
,        new StructureIndicator.DefaultElement(1,1,new Subclause())
,        new StructureIndicator.DefaultElement(1,1,new Sublist())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Hcontainer())
)
)
)
,        new StructureIndicator.DefaultElement(0,1,new Wrap())
)
,        new StructureIndicator.DefaultElement(1,1,new Content())
)
        ,

        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Num())
,        new StructureIndicator.DefaultElement(0,1,new Heading())
,        new StructureIndicator.DefaultElement(0,1,new Subheading())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "subparagraph");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget subparagraph");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Subparagraph</code> object and set up its type
*/
public Subparagraph() {
super(create());
setType("subparagraph");
}

/**
* Constructor with required attributes
*/
public Subparagraph(IDSimpleType idAttr) {
this();
setIdAttr(idAttr);
}


/**
* Create a <code>Subparagraph</code> object with the given DOM element
*/
public Subparagraph(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>spaceAttr</code> property in DSL way
        * @param spaceAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> Subparagraph</code> instance
        */
        public Subparagraph periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
}

@Override
public LinkedHashMap<String, String> getAttributes() {
final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
attrs.putAll(super.getAttributes());
return attrs;
}

@Override
public StructureIndicator getStructureIndicator() {
    return STRUCTURE_INDICATOR;
}

/**
* DSL Style for html method
*/
@Override
public Subparagraph html(String s) {
    super.html(s);
    return this;
}
}

