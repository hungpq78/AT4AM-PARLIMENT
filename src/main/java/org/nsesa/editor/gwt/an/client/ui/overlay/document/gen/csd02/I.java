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

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NCNameSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.csd02.StatusTypeSimpleType;
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
* The element i is an HTML element and is used in Akoma Ntoso as in HTML, for the italic style (an inline)
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class I extends InlineComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(0,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Ref())
,        new StructureIndicator.DefaultElement(1,1,new Mref())
,        new StructureIndicator.DefaultElement(1,1,new Rref())
,        new StructureIndicator.DefaultElement(1,1,new Mod())
,        new StructureIndicator.DefaultElement(1,1,new Mmod())
,        new StructureIndicator.DefaultElement(1,1,new Rmod())
,        new StructureIndicator.DefaultElement(1,1,new Remark())
,        new StructureIndicator.DefaultElement(1,1,new RecordedTime())
,        new StructureIndicator.DefaultElement(1,1,new Vote())
,        new StructureIndicator.DefaultElement(1,1,new Outcome())
,        new StructureIndicator.DefaultElement(1,1,new Ins())
,        new StructureIndicator.DefaultElement(1,1,new Del())
,        new StructureIndicator.DefaultElement(1,1,new Omissis())
,        new StructureIndicator.DefaultElement(1,1,new ExtractText())
,        new StructureIndicator.DefaultElement(1,1,new ExtractStructure())
,        new StructureIndicator.DefaultElement(1,1,new Placeholder())
,        new StructureIndicator.DefaultElement(1,1,new FillIn())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new B())
,        new StructureIndicator.DefaultElement(1,1,new I())
,        new StructureIndicator.DefaultElement(1,1,new A())
,        new StructureIndicator.DefaultElement(1,1,new U())
,        new StructureIndicator.DefaultElement(1,1,new Sub())
,        new StructureIndicator.DefaultElement(1,1,new Sup())
,        new StructureIndicator.DefaultElement(1,1,new Abbr())
,        new StructureIndicator.DefaultElement(1,1,new Span())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new DocType())
,        new StructureIndicator.DefaultElement(1,1,new DocTitle())
,        new StructureIndicator.DefaultElement(1,1,new DocNumber())
,        new StructureIndicator.DefaultElement(1,1,new DocProponent())
,        new StructureIndicator.DefaultElement(1,1,new DocDate())
,        new StructureIndicator.DefaultElement(1,1,new Legislature())
,        new StructureIndicator.DefaultElement(1,1,new Session())
,        new StructureIndicator.DefaultElement(1,1,new ShortTitle())
,        new StructureIndicator.DefaultElement(1,1,new DocPurpose())
,        new StructureIndicator.DefaultElement(1,1,new DocCommittee())
,        new StructureIndicator.DefaultElement(1,1,new DocIntroducer())
,        new StructureIndicator.DefaultElement(1,1,new DocStage())
,        new StructureIndicator.DefaultElement(1,1,new DocStatus())
,        new StructureIndicator.DefaultElement(1,1,new DocJurisdiction())
,        new StructureIndicator.DefaultElement(1,1,new DocketNumber())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Date())
,        new StructureIndicator.DefaultElement(1,1,new Time())
,        new StructureIndicator.DefaultElement(1,1,new Person())
,        new StructureIndicator.DefaultElement(1,1,new Organization())
,        new StructureIndicator.DefaultElement(1,1,new Concept())
,        new StructureIndicator.DefaultElement(1,1,new Object())
,        new StructureIndicator.DefaultElement(1,1,new Event())
,        new StructureIndicator.DefaultElement(1,1,new Location())
,        new StructureIndicator.DefaultElement(1,1,new Process())
,        new StructureIndicator.DefaultElement(1,1,new Role())
,        new StructureIndicator.DefaultElement(1,1,new Term())
,        new StructureIndicator.DefaultElement(1,1,new Quantity())
,        new StructureIndicator.DefaultElement(1,1,new Def())
,        new StructureIndicator.DefaultElement(1,1,new Entity())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new CourtType())
,        new StructureIndicator.DefaultElement(1,1,new NeutralCitation())
,        new StructureIndicator.DefaultElement(1,1,new Party())
,        new StructureIndicator.DefaultElement(1,1,new Judge())
,        new StructureIndicator.DefaultElement(1,1,new Lawyer())
,        new StructureIndicator.DefaultElement(1,1,new Signature())
,        new StructureIndicator.DefaultElement(1,1,new Opinion())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new AffectedDocument())
,        new StructureIndicator.DefaultElement(1,1,new RelatedDocument())
,        new StructureIndicator.DefaultElement(1,1,new Change())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Inline())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new NoteRef())
,        new StructureIndicator.DefaultElement(1,1,new Eol())
,        new StructureIndicator.DefaultElement(1,1,new Eop())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Img())
,        new StructureIndicator.DefaultElement(1,1,new Br())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Marker())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new AuthorialNote())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Popup())
)
)
)
)
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "i");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget i");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>I</code> object and set up its type
*/
public I() {
super(create());
setType("i");
}



/**
* Create a <code>I</code> object with the given DOM element
*/
public I(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> I</code> instance
        */
        public I langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>spaceAttr</code> property in DSL way
        * @param spaceAttr new value
        * @return <code> I</code> instance
        */
        public I spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> I</code> instance
        */
        public I classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> I</code> instance
        */
        public I styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> I</code> instance
        */
        public I titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> I</code> instance
        */
        public I alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> I</code> instance
        */
        public I wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> I</code> instance
        */
        public I refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> I</code> instance
        */
        public I idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> I</code> instance
        */
        public I evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> I</code> instance
        */
        public I statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> I</code> instance
        */
        public I periodAttr(final AnyURISimpleType periodAttr) {
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
public I html(String s) {
    super.html(s);
    return this;
}
}

