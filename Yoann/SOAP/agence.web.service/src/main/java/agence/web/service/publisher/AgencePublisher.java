package agence.web.service.publisher;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.Endpoint;

import agence.web.consultationWS.Agence;
import agence.web.service.client.*;


public class AgencePublisher {

	public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
		
		Agence nomAgence1 = new Agence(34763, "Agence1", "PasswordAgence1");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

		AgenceServiceUtilisateurImpl asui = new AgenceServiceUtilisateurImpl(nomAgence1);
		
//		System.out.println(asui.ConsultationOffre(520, "Nice", 3, df.parse("10-12-2022"), df.parse("10-12-2022")));
		
		
		Endpoint.publish("http://localhost:8088/agencewebservice", new AgenceServiceUtilisateurImpl(nomAgence1));
		
		System.err.println("WS Agence is ready");
		
//		System.out.println(asui.ConsultationOffre(520, "Nice", 3, df.parse("10-12-2022"), df.parse("10-12-2022")));
	}

}
