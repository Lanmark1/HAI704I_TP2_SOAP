
package agence.web.reservationWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the agence.web.reservationWS package. 
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

    private final static QName _Paiement_QNAME = new QName("http://services.service.web.hotel/", "paiement");
    private final static QName _InfosPersonnes_QNAME = new QName("http://services.service.web.hotel/", "infosPersonnes");
    private final static QName _ReservationValideResponse_QNAME = new QName("http://services.service.web.hotel/", "reservationValideResponse");
    private final static QName _GetReference_QNAME = new QName("http://services.service.web.hotel/", "getReference");
    private final static QName _ReservationValide_QNAME = new QName("http://services.service.web.hotel/", "reservationValide");
    private final static QName _ExceptionGetReference_QNAME = new QName("http://services.service.web.hotel/", "ExceptionGetReference");
    private final static QName _GetReferenceResponse_QNAME = new QName("http://services.service.web.hotel/", "getReferenceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: agence.web.reservationWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InfosPersonnes }
     * 
     */
    public InfosPersonnes createInfosPersonnes() {
        return new InfosPersonnes();
    }

    /**
     * Create an instance of {@link ReservationValideResponse }
     * 
     */
    public ReservationValideResponse createReservationValideResponse() {
        return new ReservationValideResponse();
    }

    /**
     * Create an instance of {@link Paiement }
     * 
     */
    public Paiement createPaiement() {
        return new Paiement();
    }

    /**
     * Create an instance of {@link ExceptionGetReference }
     * 
     */
    public ExceptionGetReference createExceptionGetReference() {
        return new ExceptionGetReference();
    }

    /**
     * Create an instance of {@link GetReferenceResponse }
     * 
     */
    public GetReferenceResponse createGetReferenceResponse() {
        return new GetReferenceResponse();
    }

    /**
     * Create an instance of {@link GetReference }
     * 
     */
    public GetReference createGetReference() {
        return new GetReference();
    }

    /**
     * Create an instance of {@link ReservationValide }
     * 
     */
    public ReservationValide createReservationValide() {
        return new ReservationValide();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paiement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "paiement")
    public JAXBElement<Paiement> createPaiement(Paiement value) {
        return new JAXBElement<Paiement>(_Paiement_QNAME, Paiement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfosPersonnes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "infosPersonnes")
    public JAXBElement<InfosPersonnes> createInfosPersonnes(InfosPersonnes value) {
        return new JAXBElement<InfosPersonnes>(_InfosPersonnes_QNAME, InfosPersonnes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationValideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "reservationValideResponse")
    public JAXBElement<ReservationValideResponse> createReservationValideResponse(ReservationValideResponse value) {
        return new JAXBElement<ReservationValideResponse>(_ReservationValideResponse_QNAME, ReservationValideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "getReference")
    public JAXBElement<GetReference> createGetReference(GetReference value) {
        return new JAXBElement<GetReference>(_GetReference_QNAME, GetReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationValide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "reservationValide")
    public JAXBElement<ReservationValide> createReservationValide(ReservationValide value) {
        return new JAXBElement<ReservationValide>(_ReservationValide_QNAME, ReservationValide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionGetReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "ExceptionGetReference")
    public JAXBElement<ExceptionGetReference> createExceptionGetReference(ExceptionGetReference value) {
        return new JAXBElement<ExceptionGetReference>(_ExceptionGetReference_QNAME, ExceptionGetReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "getReferenceResponse")
    public JAXBElement<GetReferenceResponse> createGetReferenceResponse(GetReferenceResponse value) {
        return new JAXBElement<GetReferenceResponse>(_GetReferenceResponse_QNAME, GetReferenceResponse.class, null, value);
    }

}
