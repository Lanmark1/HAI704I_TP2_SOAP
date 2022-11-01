package agence.web.service.publisher;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.Endpoint;

import agence.web.consultationWS.Agence;
import agence.web.service.client.AgenceServiceUtilisateurImpl;


public class AgencePublisher {

	public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
		
		Agence nomAgence1 = new Agence(34763, "Agence1", "PasswordAgence1");
		Agence nomAgence2 = new Agence(15487, "Agence2", "PasswordAgence2");
		Agence nomAgence3 = new Agence(15765, "Agence3", "PasswordAgence3");
		
		ArrayList<Agence> lstAgence = new ArrayList<>();
		
		lstAgence.add(nomAgence1);
		lstAgence.add(nomAgence2);
		lstAgence.add(nomAgence3);
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

		
		AgenceServiceUtilisateurImpl asui = new AgenceServiceUtilisateurImpl(lstAgence);
		
//		System.out.println(asui.ConsultationOffre(520, "Nice", 3, df.parse("10-12-2022"), df.parse("10-12-2022")));
		
		
		Endpoint.publish("http://localhost:8088/agencewebservice", new AgenceServiceUtilisateurImpl(lstAgence));
		
		System.err.println("WS Agence is ready");
		
//		System.out.println(asui.ConsultationOffre(520, "Nice", 3, df.parse("10-12-2022"), df.parse("10-12-2022")));
	}

}
