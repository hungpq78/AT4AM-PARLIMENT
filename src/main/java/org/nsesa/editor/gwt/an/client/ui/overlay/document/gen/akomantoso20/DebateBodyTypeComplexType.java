package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AdministrationOfOath;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.RollCall;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Prayers;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.OralStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.WrittenStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PersonalStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MinisterialStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Resolutions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.NationalInterest;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DeclarationOfVote;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Communication;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Petitions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Papers;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.NoticesOfMotion;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Questions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Address;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ProceduralMotions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PointOfOrder;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Adjournment;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DebateSection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class DebateBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public DebateBodyTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType alternativeToAttr;
    private LanguageSimpleType langAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private StatusTypeSimpleType statusAttr;
    private String wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType periodAttr;

    public java.util.List<AdministrationOfOath> getAdministrationOfOaths() {
        java.util.List<AdministrationOfOath> result = new ArrayList<AdministrationOfOath>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
                result.add((AdministrationOfOath)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<AdministrationOfOath> getAdministrationOfOathList() {
        return  getAdministrationOfOaths();
    }
    //DSL Style set value
    public AdministrationOfOath addAdministrationOfOath(AdministrationOfOath administrationOfOathElem) {
        this.addAmendableWidget(administrationOfOathElem);
        return administrationOfOathElem;
    }

    public java.util.List<RollCall> getRollCalls() {
        java.util.List<RollCall> result = new ArrayList<RollCall>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
                result.add((RollCall)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<RollCall> getRollCallList() {
        return  getRollCalls();
    }
    //DSL Style set value
    public RollCall addRollCall(RollCall rollCallElem) {
        this.addAmendableWidget(rollCallElem);
        return rollCallElem;
    }

    public java.util.List<Prayers> getPrayerses() {
        java.util.List<Prayers> result = new ArrayList<Prayers>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
                result.add((Prayers)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Prayers> getPrayersList() {
        return  getPrayerses();
    }
    //DSL Style set value
    public Prayers addPrayers(Prayers prayersElem) {
        this.addAmendableWidget(prayersElem);
        return prayersElem;
    }

    public java.util.List<OralStatements> getOralStatementses() {
        java.util.List<OralStatements> result = new ArrayList<OralStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
                result.add((OralStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<OralStatements> getOralStatementsList() {
        return  getOralStatementses();
    }
    //DSL Style set value
    public OralStatements addOralStatements(OralStatements oralStatementsElem) {
        this.addAmendableWidget(oralStatementsElem);
        return oralStatementsElem;
    }

    public java.util.List<WrittenStatements> getWrittenStatementses() {
        java.util.List<WrittenStatements> result = new ArrayList<WrittenStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
                result.add((WrittenStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<WrittenStatements> getWrittenStatementsList() {
        return  getWrittenStatementses();
    }
    //DSL Style set value
    public WrittenStatements addWrittenStatements(WrittenStatements writtenStatementsElem) {
        this.addAmendableWidget(writtenStatementsElem);
        return writtenStatementsElem;
    }

    public java.util.List<PersonalStatements> getPersonalStatementses() {
        java.util.List<PersonalStatements> result = new ArrayList<PersonalStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
                result.add((PersonalStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<PersonalStatements> getPersonalStatementsList() {
        return  getPersonalStatementses();
    }
    //DSL Style set value
    public PersonalStatements addPersonalStatements(PersonalStatements personalStatementsElem) {
        this.addAmendableWidget(personalStatementsElem);
        return personalStatementsElem;
    }

    public java.util.List<MinisterialStatements> getMinisterialStatementses() {
        java.util.List<MinisterialStatements> result = new ArrayList<MinisterialStatements>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
                result.add((MinisterialStatements)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<MinisterialStatements> getMinisterialStatementsList() {
        return  getMinisterialStatementses();
    }
    //DSL Style set value
    public MinisterialStatements addMinisterialStatements(MinisterialStatements ministerialStatementsElem) {
        this.addAmendableWidget(ministerialStatementsElem);
        return ministerialStatementsElem;
    }

    public java.util.List<Resolutions> getResolutionses() {
        java.util.List<Resolutions> result = new ArrayList<Resolutions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
                result.add((Resolutions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Resolutions> getResolutionsList() {
        return  getResolutionses();
    }
    //DSL Style set value
    public Resolutions addResolutions(Resolutions resolutionsElem) {
        this.addAmendableWidget(resolutionsElem);
        return resolutionsElem;
    }

    public java.util.List<NationalInterest> getNationalInterests() {
        java.util.List<NationalInterest> result = new ArrayList<NationalInterest>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
                result.add((NationalInterest)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<NationalInterest> getNationalInterestList() {
        return  getNationalInterests();
    }
    //DSL Style set value
    public NationalInterest addNationalInterest(NationalInterest nationalInterestElem) {
        this.addAmendableWidget(nationalInterestElem);
        return nationalInterestElem;
    }

    public java.util.List<DeclarationOfVote> getDeclarationOfVotes() {
        java.util.List<DeclarationOfVote> result = new ArrayList<DeclarationOfVote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
                result.add((DeclarationOfVote)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DeclarationOfVote> getDeclarationOfVoteList() {
        return  getDeclarationOfVotes();
    }
    //DSL Style set value
    public DeclarationOfVote addDeclarationOfVote(DeclarationOfVote declarationOfVoteElem) {
        this.addAmendableWidget(declarationOfVoteElem);
        return declarationOfVoteElem;
    }

    public java.util.List<Communication> getCommunications() {
        java.util.List<Communication> result = new ArrayList<Communication>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
                result.add((Communication)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Communication> getCommunicationList() {
        return  getCommunications();
    }
    //DSL Style set value
    public Communication addCommunication(Communication communicationElem) {
        this.addAmendableWidget(communicationElem);
        return communicationElem;
    }

    public java.util.List<Petitions> getPetitionses() {
        java.util.List<Petitions> result = new ArrayList<Petitions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
                result.add((Petitions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Petitions> getPetitionsList() {
        return  getPetitionses();
    }
    //DSL Style set value
    public Petitions addPetitions(Petitions petitionsElem) {
        this.addAmendableWidget(petitionsElem);
        return petitionsElem;
    }

    public java.util.List<Papers> getPaperses() {
        java.util.List<Papers> result = new ArrayList<Papers>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
                result.add((Papers)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Papers> getPapersList() {
        return  getPaperses();
    }
    //DSL Style set value
    public Papers addPapers(Papers papersElem) {
        this.addAmendableWidget(papersElem);
        return papersElem;
    }

    public java.util.List<NoticesOfMotion> getNoticesOfMotions() {
        java.util.List<NoticesOfMotion> result = new ArrayList<NoticesOfMotion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
                result.add((NoticesOfMotion)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<NoticesOfMotion> getNoticesOfMotionList() {
        return  getNoticesOfMotions();
    }
    //DSL Style set value
    public NoticesOfMotion addNoticesOfMotion(NoticesOfMotion noticesOfMotionElem) {
        this.addAmendableWidget(noticesOfMotionElem);
        return noticesOfMotionElem;
    }

    public java.util.List<Questions> getQuestionses() {
        java.util.List<Questions> result = new ArrayList<Questions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
                result.add((Questions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Questions> getQuestionsList() {
        return  getQuestionses();
    }
    //DSL Style set value
    public Questions addQuestions(Questions questionsElem) {
        this.addAmendableWidget(questionsElem);
        return questionsElem;
    }

    public java.util.List<Address> getAddresses() {
        java.util.List<Address> result = new ArrayList<Address>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
                result.add((Address)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Address> getAddressList() {
        return  getAddresses();
    }
    //DSL Style set value
    public Address addAddress(Address addressElem) {
        this.addAmendableWidget(addressElem);
        return addressElem;
    }

    public java.util.List<ProceduralMotions> getProceduralMotionses() {
        java.util.List<ProceduralMotions> result = new ArrayList<ProceduralMotions>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
                result.add((ProceduralMotions)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<ProceduralMotions> getProceduralMotionsList() {
        return  getProceduralMotionses();
    }
    //DSL Style set value
    public ProceduralMotions addProceduralMotions(ProceduralMotions proceduralMotionsElem) {
        this.addAmendableWidget(proceduralMotionsElem);
        return proceduralMotionsElem;
    }

    public java.util.List<PointOfOrder> getPointOfOrders() {
        java.util.List<PointOfOrder> result = new ArrayList<PointOfOrder>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
                result.add((PointOfOrder)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<PointOfOrder> getPointOfOrderList() {
        return  getPointOfOrders();
    }
    //DSL Style set value
    public PointOfOrder addPointOfOrder(PointOfOrder pointOfOrderElem) {
        this.addAmendableWidget(pointOfOrderElem);
        return pointOfOrderElem;
    }

    public java.util.List<Adjournment> getAdjournments() {
        java.util.List<Adjournment> result = new ArrayList<Adjournment>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
                result.add((Adjournment)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Adjournment> getAdjournmentList() {
        return  getAdjournments();
    }
    //DSL Style set value
    public Adjournment addAdjournment(Adjournment adjournmentElem) {
        this.addAmendableWidget(adjournmentElem);
        return adjournmentElem;
    }

    public java.util.List<DebateSection> getDebateSections() {
        java.util.List<DebateSection> result = new ArrayList<DebateSection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
                result.add((DebateSection)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<DebateSection> getDebateSectionList() {
        return  getDebateSections();
    }
    //DSL Style set value
    public DebateSection addDebateSection(DebateSection debateSectionElem) {
        this.addAmendableWidget(debateSectionElem);
        return debateSectionElem;
    }

    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(amendableElement.getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }
    //DSL Style get value
    public AnyURISimpleType alternativeToAttr() {
         return  getAlternativeToAttr();
    }

    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }
    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(amendableElement.getAttribute("lang"));
        }

        return langAttr;
    }
    //DSL Style get value
    public LanguageSimpleType langAttr() {
         return  getLangAttr();
    }

    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }
    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(amendableElement.getAttribute("class"));
        }

        return classAttr;
    }
    //DSL Style get value
    public StringSimpleType classAttr() {
         return  getClassAttr();
    }

    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }
    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(amendableElement.getAttribute("style"));
        }

        return styleAttr;
    }
    //DSL Style get value
    public StringSimpleType styleAttr() {
         return  getStyleAttr();
    }

    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }
    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(amendableElement.getAttribute("title"));
        }

        return titleAttr;
    }
    //DSL Style get value
    public StringSimpleType titleAttr() {
         return  getTitleAttr();
    }

    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
        }

        return statusAttr;
    }
    //DSL Style get value
    public StatusTypeSimpleType statusAttr() {
         return  getStatusAttr();
    }

    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    //DSL Style get value
    public String wildcardContentAttr() {
         return  getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    //DSL Style get value
    public IDSimpleType idAttr() {
         return  getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    //DSL Style get value
    public NMTOKENSimpleType evolvingIdAttr() {
         return  getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
         return  getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
        }

        return periodAttr;
    }
    //DSL Style get value
    public AnyURISimpleType periodAttr() {
         return  getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    //DSL Style set value
    public DebateBodyTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"petitions","administrationOfOath","communication","debateSection","noticesOfMotion","questions","resolutions","papers","personalStatements","proceduralMotions","oralStatements","rollCall","address","nationalInterest","writtenStatements","declarationOfVote","pointOfOrder","adjournment","prayers","ministerialStatements"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("alternativeToAttr", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("langAttr", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("classAttr", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("styleAttr", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("titleAttr", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("statusAttr", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("wildcardContentAttr", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("idAttr", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingIdAttr", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("refersToAttr", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("periodAttr", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }

}
