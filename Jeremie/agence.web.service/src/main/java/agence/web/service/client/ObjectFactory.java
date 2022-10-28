
package agence.web.service.client;

import java.time.LocalDate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the agence.web.service.client package. 
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

    private final static QName _GetHotelsServiceResponse_QNAME = new QName("http://services.service.web.hotel/", "getHotelsServiceResponse");
    private final static QName _GetHotelsService_QNAME = new QName("http://services.service.web.hotel/", "getHotelsService");
    private final static QName _GetListeOffresResponse_QNAME = new QName("http://services.service.web.hotel/", "getListeOffresResponse");
    private final static QName _GetListeOffres_QNAME = new QName("http://services.service.web.hotel/", "getListeOffres");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: agence.web.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHotelsServiceResponse }
     * 
     */
    public GetHotelsServiceResponse createGetHotelsServiceResponse() {
        return new GetHotelsServiceResponse();
    }

    /**
     * Create an instance of {@link GetListeOffres }
     * 
     */
    public GetListeOffres createGetListeOffres() {
        return new GetListeOffres();
    }

    /**
     * Create an instance of {@link GetHotelsService }
     * 
     */
    public GetHotelsService createGetHotelsService() {
        return new GetHotelsService();
    }

    /**
     * Create an instance of {@link GetListeOffresResponse }
     * 
     */
    public GetListeOffresResponse createGetListeOffresResponse() {
        return new GetListeOffresResponse();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
  
    /**
     * Create an instance of {@link Offre }
     * 
     */
    public Offre createOffre() {
        return new Offre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelsServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "getHotelsServiceResponse")
    public JAXBElement<GetHotelsServiceResponse> createGetHotelsServiceResponse(GetHotelsServiceResponse value) {
        return new JAXBElement<GetHotelsServiceResponse>(_GetHotelsServiceResponse_QNAME, GetHotelsServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelsService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "getHotelsService")
    public JAXBElement<GetHotelsService> createGetHotelsService(GetHotelsService value) {
        return new JAXBElement<GetHotelsService>(_GetHotelsService_QNAME, GetHotelsService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeOffresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "getListeOffresResponse")
    public JAXBElement<GetListeOffresResponse> createGetListeOffresResponse(GetListeOffresResponse value) {
        return new JAXBElement<GetListeOffresResponse>(_GetListeOffresResponse_QNAME, GetListeOffresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeOffres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.service.web.hotel/", name = "getListeOffres")
    public JAXBElement<GetListeOffres> createGetListeOffres(GetListeOffres value) {
        return new JAXBElement<GetListeOffres>(_GetListeOffres_QNAME, GetListeOffres.class, null, value);
    }

}
