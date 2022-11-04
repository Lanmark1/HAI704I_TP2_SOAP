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
		
		Agence nomAgence1 = new Agence(34763, "Trivallez", "PasswordTrivallez");
		Agence nomAgence2 = new Agence(57500, "Hotel.gouv", "PasswordHotel.gouv");
		Agence nomAgence3 = new Agence(13094, "TripConseiller", "PasswordTripConseiller");
		
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
