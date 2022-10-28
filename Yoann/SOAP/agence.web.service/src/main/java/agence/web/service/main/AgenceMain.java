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

import agence.web.service.client.HotelServiceConsultImplService;
import agence.web.service.client.IHotelServiceConsult;




public class AgenceMain {

	public static void main(String[] args) throws MalformedURLException, ParseException, DatatypeConfigurationException {
		
		URL url = new URL("http://localhost:8080/hotelserviceconsult?wsdl");
		HotelServiceConsultImplService consultImpl = new HotelServiceConsultImplService(url);
		IHotelServiceConsult proxy = consultImpl.getHotelServiceConsultImplPort();
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(df.parse("11-10-2022"));
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		System.out.println(proxy.getListeOffres(15051, "Nice", date2 ,date2, 3).get(0).getDateDispo());
		
	}

}
