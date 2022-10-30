
package agence.web.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HotelServiceReservationImplService", targetNamespace = "http://services.service.web.hotel/", wsdlLocation = "http://localhost:8080/hotelservicereservation?wsdl")
public class HotelServiceReservationImplService
    extends Service
{

    private final static URL HOTELSERVICERESERVATIONIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELSERVICERESERVATIONIMPLSERVICE_EXCEPTION;
    private final static QName HOTELSERVICERESERVATIONIMPLSERVICE_QNAME = new QName("http://services.service.web.hotel/", "HotelServiceReservationImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/hotelservicereservation?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELSERVICERESERVATIONIMPLSERVICE_WSDL_LOCATION = url;
        HOTELSERVICERESERVATIONIMPLSERVICE_EXCEPTION = e;
    }

    public HotelServiceReservationImplService() {
        super(__getWsdlLocation(), HOTELSERVICERESERVATIONIMPLSERVICE_QNAME);
    }

    public HotelServiceReservationImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELSERVICERESERVATIONIMPLSERVICE_QNAME, features);
    }

    public HotelServiceReservationImplService(URL wsdlLocation) {
        super(wsdlLocation, HOTELSERVICERESERVATIONIMPLSERVICE_QNAME);
    }

    public HotelServiceReservationImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELSERVICERESERVATIONIMPLSERVICE_QNAME, features);
    }

    public HotelServiceReservationImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelServiceReservationImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IHotelServiceReservation
     */
    @WebEndpoint(name = "HotelServiceReservationImplPort")
    public IHotelServiceReservation getHotelServiceReservationImplPort() {
        return super.getPort(new QName("http://services.service.web.hotel/", "HotelServiceReservationImplPort"), IHotelServiceReservation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHotelServiceReservation
     */
    @WebEndpoint(name = "HotelServiceReservationImplPort")
    public IHotelServiceReservation getHotelServiceReservationImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.service.web.hotel/", "HotelServiceReservationImplPort"), IHotelServiceReservation.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELSERVICERESERVATIONIMPLSERVICE_EXCEPTION!= null) {
            throw HOTELSERVICERESERVATIONIMPLSERVICE_EXCEPTION;
        }
        return HOTELSERVICERESERVATIONIMPLSERVICE_WSDL_LOCATION;
    }

}