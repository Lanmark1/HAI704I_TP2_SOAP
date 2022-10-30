package agence.web.service.main;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import agence.web.reservationWS.ExceptionGetReference_Exception;
import agence.web.reservationWS.HotelServiceReservationImplService;
import agence.web.reservationWS.IHotelServiceReservation;
import agence.web.reservationWS.InfosPersonnes;
import agence.web.reservationWS.Paiement;




public class ReservationMain {

	public static void main(String[] args) throws MalformedURLException, ParseException, DatatypeConfigurationException, ExceptionGetReference_Exception {
		
		URL url = new URL("http://localhost:8080/hotelservicereservation?wsdl");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		HotelServiceReservationImplService consultImpl = new HotelServiceReservationImplService(url);
		IHotelServiceReservation proxy = consultImpl.getHotelServiceReservationImplPort();
		
		Paiement p1 = new Paiement(978, "17-11-2987", "36416873239");
		
		GregorianCalendar GCDateDebut = new GregorianCalendar();
		GCDateDebut.setTime(df.parse("11-11-2022"));
		XMLGregorianCalendar dateDebut = DatatypeFactory.newInstance().newXMLGregorianCalendar(GCDateDebut);
		
		GregorianCalendar GCDateFin = new GregorianCalendar();
		GCDateFin.setTime(df.parse("11-12-2022"));
		XMLGregorianCalendar dateFin = DatatypeFactory.newInstance().newXMLGregorianCalendar(GCDateFin);
		
		
		InfosPersonnes infos1 = new InfosPersonnes("REYNE", p1);
		System.out.println(proxy.reservationValide(2321, "agence1", "pw", 1, infos1, dateDebut, dateFin));
		System.out.println(proxy.getReference());

	}

}
