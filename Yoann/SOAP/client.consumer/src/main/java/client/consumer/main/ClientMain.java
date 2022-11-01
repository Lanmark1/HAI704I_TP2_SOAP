package client.consumer.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import client.consumer.service.AgenceServiceUtilisateurImplService;
import client.consumer.service.DatatypeConfigurationException_Exception;
import client.consumer.service.IAgenceServiceUtilisateur;

public class ClientMain {

	public static void main(String[] args) throws MalformedURLException, ParseException, DatatypeConfigurationException, DatatypeConfigurationException_Exception {

		URL url = new URL("http://localhost:8088/agencewebservice?wsdl");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		AgenceServiceUtilisateurImplService agenceImpl = new AgenceServiceUtilisateurImplService(url);
		IAgenceServiceUtilisateur proxy = agenceImpl.getAgenceServiceUtilisateurImplPort();
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(df.parse("11-10-2022"));
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		System.out.println(proxy.consultationOffre(150, "Montpellier", 3, date2, date2));
		
	}

}
