
package agence.web.service.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IHotelServiceConsult", targetNamespace = "http://services.service.web.hotel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IHotelServiceConsult {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<agence.web.service.Offre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListeOffres", targetNamespace = "http://services.service.web.hotel/", className = "agence.web.service.GetListeOffres")
    @ResponseWrapper(localName = "getListeOffresResponse", targetNamespace = "http://services.service.web.hotel/", className = "agence.web.service.GetListeOffresResponse")
    @Action(input = "http://services.service.web.hotel/IHotelServiceConsult/getListeOffresRequest", output = "http://services.service.web.hotel/IHotelServiceConsult/getListeOffresResponse")
    public List<Offre> getListeOffres(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        LocalDate arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        LocalDate arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4);

}
