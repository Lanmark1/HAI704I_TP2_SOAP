
package client.consumer.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.consumer.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExceptionGetReference_QNAME = new QName("http://services.service.web.hotel/", "ExceptionGetReference");
    private final static QName _ConsultationOffre_QNAME = new QName("http://client.service.web.agence/", "ConsultationOffre");
    private final static QName _ConsultationOffreResponse_QNAME = new QName("http://client.service.web.agence/", "ConsultationOffreResponse");
    private final static QName _DatatypeConfigurationException_QNAME = new QName("http://client.service.web.agence/", "DatatypeConfigurationException");
    private final static QName _ParseException_QNAME = new QName("http://client.service.web.agence/", "ParseException");
    private final static QName _Reservation_QNAME = new QName("http://client.service.web.agence/", "Reservation");
    private final static QName _ReservationResponse_QNAME = new QName("http://client.service.web.agence/", "ReservationResponse");
    private final static QName _GetAgenceNames_QNAME = new QName("http://client.service.web.agence/", "getAgenceNames");
    private final static QName _GetAgenceNamesResponse_QNAME = new QName("http://client.service.web.agence/", "getAgenceNamesResponse");
    private final static QName _GetImageURL_QNAME = new QName("http://client.service.web.agence/", "getImageURL");
    private final static QName _GetImageURLResponse_QNAME = new QName("http://client.service.web.agence/", "getImageURLResponse");
    private final static QName _GetReferenceResa_QNAME = new QName("http://client.service.web.agence/", "getReferenceResa");
    private final static QName _GetReferenceResaResponse_QNAME = new QName("http://client.service.web.agence/", "getReferenceResaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.consumer.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExceptionGetReference }
     * 
     */
    public ExceptionGetReference createExceptionGetReference() {
        return new ExceptionGetReference();
    }

    /**
     * Create an instance of {@link InfosPersonnes }
     * 
     */
    public InfosPersonnes createInfosPersonnes() {
        return new InfosPersonnes();
    }

    /**
     * Create an instance of {@link Paiement }
     * 
     */
    public Paiement createPaiement() {
        return new Paiement();
    }

    /**
     * Create an instance of {@link Offre }
     * 
     */
    public Offre createOffre() {
        return new Offre();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Agence }
     * 
     */
    public Agence createAgence() {
        return new Agence();
    }

    /**
     * Create an instance of {@link ConsultationOffre }
     * 
     */
    public ConsultationOffre createConsultationOffre() {
        return new ConsultationOffre();
    }

    /**
     * Create an instance of {@link ConsultationOffreResponse }
     * 
     */
    public ConsultationOffreResponse createConsultationOffreResponse() {
        return new ConsultationOffreResponse();
    }

    /**
     * Create an instance of {@link DatatypeConfigurationException }
     * 
     */
    public DatatypeConfigurationException createDatatypeConfigurationException() {
        return new DatatypeConfigurationException();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link ReservationResponse }
     * 
     */
    public ReservationResponse createReservationResponse() {
        return new ReservationResponse();
    }

    /**
     * Create an instance of {@link GetAgenceNames }
     * 
     */
    public GetAgenceNames createGetAgenceNames() {
        return new GetAgenceNames();
    }

    /**
     * Create an instance of {@link GetAgenceNamesResponse }
     * 
     */
    public GetAgenceNamesResponse createGetAgenceNamesResponse() {
        return new GetAgenceNamesResponse();
    }

    /**
     * Create an instance of {@link GetImageURL }
     * 
     */
    public GetImageURL createGetImageURL() {
        return new GetImageURL();
    }

    /**
     * Create an instance of {@link GetImageURLResponse }
     * 
     */
    public GetImageURLResponse createGetImageURLResponse() {
        return new GetImageURLResponse();
    }

    /**
     * Create an instance of {@link GetReferenceResa }
     * 
     */
    public GetReferenceResa createGetReferenceResa() {
        return new GetReferenceResa();
    }

    /**
     * Create an instance of {@link GetReferenceResaResponse }
     * 
     */
    public GetReferenceResaResponse createGetReferenceResaResponse() {
        return new GetReferenceResaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionGetReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExceptionGetReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "ExceptionGetReference")
    public JAXBElement<ExceptionGetReference> createExceptionGetReference(ExceptionGetReference value) {
        return new JAXBElement<ExceptionGetReference>(_ExceptionGetReference_QNAME, ExceptionGetReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultationOffre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultationOffre }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "ConsultationOffre")
    public JAXBElement<ConsultationOffre> createConsultationOffre(ConsultationOffre value) {
        return new JAXBElement<ConsultationOffre>(_ConsultationOffre_QNAME, ConsultationOffre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultationOffreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultationOffreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "ConsultationOffreResponse")
    public JAXBElement<ConsultationOffreResponse> createConsultationOffreResponse(ConsultationOffreResponse value) {
        return new JAXBElement<ConsultationOffreResponse>(_ConsultationOffreResponse_QNAME, ConsultationOffreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatatypeConfigurationException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatatypeConfigurationException }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "DatatypeConfigurationException")
    public JAXBElement<DatatypeConfigurationException> createDatatypeConfigurationException(DatatypeConfigurationException value) {
        return new JAXBElement<DatatypeConfigurationException>(_DatatypeConfigurationException_QNAME, DatatypeConfigurationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "Reservation")
    public JAXBElement<Reservation> createReservation(Reservation value) {
        return new JAXBElement<Reservation>(_Reservation_QNAME, Reservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "ReservationResponse")
    public JAXBElement<ReservationResponse> createReservationResponse(ReservationResponse value) {
        return new JAXBElement<ReservationResponse>(_ReservationResponse_QNAME, ReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenceNames }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAgenceNames }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "getAgenceNames")
    public JAXBElement<GetAgenceNames> createGetAgenceNames(GetAgenceNames value) {
        return new JAXBElement<GetAgenceNames>(_GetAgenceNames_QNAME, GetAgenceNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenceNamesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAgenceNamesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "getAgenceNamesResponse")
    public JAXBElement<GetAgenceNamesResponse> createGetAgenceNamesResponse(GetAgenceNamesResponse value) {
        return new JAXBElement<GetAgenceNamesResponse>(_GetAgenceNamesResponse_QNAME, GetAgenceNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImageURL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetImageURL }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "getImageURL")
    public JAXBElement<GetImageURL> createGetImageURL(GetImageURL value) {
        return new JAXBElement<GetImageURL>(_GetImageURL_QNAME, GetImageURL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImageURLResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetImageURLResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "getImageURLResponse")
    public JAXBElement<GetImageURLResponse> createGetImageURLResponse(GetImageURLResponse value) {
        return new JAXBElement<GetImageURLResponse>(_GetImageURLResponse_QNAME, GetImageURLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReferenceResa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReferenceResa }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "getReferenceResa")
    public JAXBElement<GetReferenceResa> createGetReferenceResa(GetReferenceResa value) {
        return new JAXBElement<GetReferenceResa>(_GetReferenceResa_QNAME, GetReferenceResa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReferenceResaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReferenceResaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://client.service.web.agence/", name = "getReferenceResaResponse")
    public JAXBElement<GetReferenceResaResponse> createGetReferenceResaResponse(GetReferenceResaResponse value) {
        return new JAXBElement<GetReferenceResaResponse>(_GetReferenceResaResponse_QNAME, GetReferenceResaResponse.class, null, value);
    }

}
