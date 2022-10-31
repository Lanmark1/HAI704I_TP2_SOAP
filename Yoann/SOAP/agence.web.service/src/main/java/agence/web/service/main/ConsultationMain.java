package agence.web.service.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;

import agence.web.consultationWS.HotelServiceConsultImplService;
import agence.web.consultationWS.IHotelServiceConsult;

public class ConsultationMain {

	public static void main(String[] args) throws MalformedURLException, ParseException, DatatypeConfigurationException {
	
		URL url = new URL("http://localhost:8080/hotelserviceconsult?wsdl");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		HotelServiceConsultImplService consultImpl = new HotelServiceConsultImplService(url);
		IHotelServiceConsult proxy = consultImpl.getHotelServiceConsultImplPort();
		System.out.println(proxy.getHotelsService());
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(df.parse("11-10-2022"));
//		System.out.println(proxy.getHotelsService());
//		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
//		System.out.println(proxy.getListeOffres(15051, "Nice", date2 ,date2, 3));
//		System.out.println(proxy.getListeOffres(15051, "Nice", date2 ,date2, 3));
//		
	}

}
