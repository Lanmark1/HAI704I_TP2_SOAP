
package agence.web.reservationWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IHotelServiceReservation", targetNamespace = "http://services.service.web.hotel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IHotelServiceReservation {


    /**
     * 
     * @return
     *     returns int
     * @throws ExceptionGetReference_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReference", targetNamespace = "http://services.service.web.hotel/", className = "agence.web.reservationWS.GetReference")
    @ResponseWrapper(localName = "getReferenceResponse", targetNamespace = "http://services.service.web.hotel/", className = "agence.web.reservationWS.GetReferenceResponse")
    @Action(input = "http://services.service.web.hotel/IHotelServiceReservation/getReferenceRequest", output = "http://services.service.web.hotel/IHotelServiceReservation/getReferenceResponse", fault = {
        @FaultAction(className = ExceptionGetReference_Exception.class, value = "http://services.service.web.hotel/IHotelServiceReservation/getReference/Fault/ExceptionGetReference")
    })
    public int getReference()
        throws ExceptionGetReference_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reservationValide", targetNamespace = "http://services.service.web.hotel/", className = "agence.web.reservationWS.ReservationValide")
    @ResponseWrapper(localName = "reservationValideResponse", targetNamespace = "http://services.service.web.hotel/", className = "agence.web.reservationWS.ReservationValideResponse")
    @Action(input = "http://services.service.web.hotel/IHotelServiceReservation/reservationValideRequest", output = "http://services.service.web.hotel/IHotelServiceReservation/reservationValideResponse")
    public float reservationValide(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        InfosPersonnes arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        XMLGregorianCalendar arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        XMLGregorianCalendar arg6);

}
