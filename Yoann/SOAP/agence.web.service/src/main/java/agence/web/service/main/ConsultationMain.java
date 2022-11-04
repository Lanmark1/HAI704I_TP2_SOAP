package agence.web.service.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import agence.web.consultationWS.HotelServiceConsultImplService;
import agence.web.consultationWS.IHotelServiceConsult;

public class ConsultationMain {

	public static void main(String[] args) throws MalformedURLException, ParseException, DatatypeConfigurationException{
	
		URL url = new URL("http://localhost:8080/hotelserviceconsult?wsdl");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		HotelServiceConsultImplService consultImpl = new HotelServiceConsultImplService(url);
		IHotelServiceConsult proxy = consultImpl.getHotelServiceConsultImplPort();
//		System.out.println(proxy.getHotelsService().get(1).getVille());
		
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(df.parse("29-10-2022"));
//		System.out.println(proxy.getHotelsService());
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
//		System.out.println(proxy.getListeOffres(15051, "Nice", date2 ,date2, 3));
		System.out.println(proxy.getListeOffres(15051, "Password", "Nice", 1000, date2 ,date2, 3, 3));
//		int identifiant, String password, String ville, float prix, Date DateDebut, Date DateFin, int nbrPersonnes
	}

}
