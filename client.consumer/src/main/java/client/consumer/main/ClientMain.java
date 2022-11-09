package client.consumer.main;

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

import client.consumer.service.AgenceServiceUtilisateurImplService;
import client.consumer.service.DatatypeConfigurationException_Exception;
import client.consumer.service.ExceptionGetReferenceException;
import client.consumer.service.IAgenceServiceUtilisateur;
import client.consumer.service.InfosPersonnes;
import client.consumer.service.Offre;
import client.consumer.service.ParseException_Exception;

public class ClientMain {

	public static void main(String[] args) throws MalformedURLException, ParseException, DatatypeConfigurationException, DatatypeConfigurationException_Exception, ExceptionGetReferenceException, ParseException_Exception {

		URL url = new URL("http://localhost:8088/agencewebservice?wsdl");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		AgenceServiceUtilisateurImplService agenceImpl = new AgenceServiceUtilisateurImplService(url);
		IAgenceServiceUtilisateur proxy = agenceImpl.getAgenceServiceUtilisateurImplPort();
		InfosPersonnes ip = new InfosPersonnes();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(df.parse("31-12-2023"));
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		System.out.println(proxy.consultationOffre("Agence1", 150, "Montpellier", 3, date2, date2,3).get(0).getIdentifiant());
		System.out.println(proxy.reservation("Agence2", ip, 2, date2, date2));
	}

}
