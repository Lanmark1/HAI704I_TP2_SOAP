package agence.web.service.main;
import agence.web.service.client.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import agence.web.service.client.ExceptionGetReference_Exception;
import agence.web.service.client.HotelServiceConsultImplService;
import agence.web.service.client.HotelServiceReservationImplService;
import agence.web.service.client.IHotelServiceConsult;
import agence.web.service.client.IHotelServiceReservation;




public class AgenceMain {

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
//		
//		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		GregorianCalendar c = new GregorianCalendar();
//		c.setTime(df.parse("11-10-2022"));
//		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
//		System.out.println(proxy.getListeOffres(15051, "Nice", date2 ,date2, 3).get(0).getPrix());
//		System.out.println(proxy.getListeOffres(15051, "Nice", date2 ,date2, 3));
		
	}

}
