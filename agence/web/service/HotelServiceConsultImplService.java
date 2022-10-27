
package agence.web.service;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HotelServiceConsultImplService", targetNamespace = "http://services.service.web.hotel/", wsdlLocation = "http://localhost:8080/hotelserviceconsult?wsdl")
public class HotelServiceConsultImplService
    extends Service
{

    private final static URL HOTELSERVICECONSULTIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELSERVICECONSULTIMPLSERVICE_EXCEPTION;
    private final static QName HOTELSERVICECONSULTIMPLSERVICE_QNAME = new QName("http://services.service.web.hotel/", "HotelServiceConsultImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/hotelserviceconsult?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELSERVICECONSULTIMPLSERVICE_WSDL_LOCATION = url;
        HOTELSERVICECONSULTIMPLSERVICE_EXCEPTION = e;
    }

    public HotelServiceConsultImplService() {
        super(__getWsdlLocation(), HOTELSERVICECONSULTIMPLSERVICE_QNAME);
    }

    public HotelServiceConsultImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELSERVICECONSULTIMPLSERVICE_QNAME, features);
    }

    public HotelServiceConsultImplService(URL wsdlLocation) {
        super(wsdlLocation, HOTELSERVICECONSULTIMPLSERVICE_QNAME);
    }

    public HotelServiceConsultImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELSERVICECONSULTIMPLSERVICE_QNAME, features);
    }

    public HotelServiceConsultImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelServiceConsultImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IHotelServiceConsult
     */
    @WebEndpoint(name = "HotelServiceConsultImplPort")
    public IHotelServiceConsult getHotelServiceConsultImplPort() {
        return super.getPort(new QName("http://services.service.web.hotel/", "HotelServiceConsultImplPort"), IHotelServiceConsult.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHotelServiceConsult
     */
    @WebEndpoint(name = "HotelServiceConsultImplPort")
    public IHotelServiceConsult getHotelServiceConsultImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.service.web.hotel/", "HotelServiceConsultImplPort"), IHotelServiceConsult.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELSERVICECONSULTIMPLSERVICE_EXCEPTION!= null) {
            throw HOTELSERVICECONSULTIMPLSERVICE_EXCEPTION;
        }
        return HOTELSERVICECONSULTIMPLSERVICE_WSDL_LOCATION;
    }

}