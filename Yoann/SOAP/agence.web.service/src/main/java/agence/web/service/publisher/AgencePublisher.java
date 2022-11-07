package agence.web.service.publisher;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.Endpoint;

import agence.web.consultationWS.Agence;
import agence.web.consultationWS.Hotel;
import agence.web.consultationWS.HotelServiceConsultImplService;
import agence.web.consultationWS.IHotelServiceConsult;
import agence.web.service.client.AgenceServiceUtilisateurImpl;


public class AgencePublisher {

	public static void main(String[] args) throws DatatypeConfigurationException, ParseException, MalformedURLException {
		
		URL url = new URL("http://localhost:8080/hotelserviceconsult?wsdl");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		HotelServiceConsultImplService consultImpl = new HotelServiceConsultImplService(url);
		IHotelServiceConsult proxy = consultImpl.getHotelServiceConsultImplPort();
	
		ArrayList<Hotel> hotelsPAgence1 = new ArrayList<>();
		ArrayList<Hotel> hotelsPAgence2 = new ArrayList<>();
		ArrayList<Hotel> hotelsPAgence3 = new ArrayList<>();

		hotelsPAgence1.add(proxy.getHotelsService().get(0));
		hotelsPAgence1.add(proxy.getHotelsService().get(1));

		hotelsPAgence2.add(proxy.getHotelsService().get(1));
		hotelsPAgence2.add(proxy.getHotelsService().get(2));
		
		hotelsPAgence3.add(proxy.getHotelsService().get(2));

		
		Agence nomAgence1 = new Agence(34763, "Trivallez", "PasswordTrivallez", hotelsPAgence1);
		Agence nomAgence2 = new Agence(57500, "Hotel.gouv", "PasswordHotel.gouv", hotelsPAgence2);
		Agence nomAgence3 = new Agence(13094, "TripConseiller", "PasswordTripConseiller", hotelsPAgence3);
		
		
	
		ArrayList<Agence> lstAgence = new ArrayList<>();
		
		System.out.println(nomAgence1.getHotelpartenaires());
		System.out.println(nomAgence2.getHotelpartenaires());
		System.out.println(nomAgence3.getHotelpartenaires());

		lstAgence.add(nomAgence1);
		lstAgence.add(nomAgence2);
		lstAgence.add(nomAgence3);
		

		
		AgenceServiceUtilisateurImpl asui = new AgenceServiceUtilisateurImpl(lstAgence);
		
//		System.out.println(asui.ConsultationOffre(520, "Nice", 3, df.parse("10-12-2022"), df.parse("10-12-2022")));
		
		
		Endpoint.publish("http://localhost:8088/agencewebservice", new AgenceServiceUtilisateurImpl(lstAgence));
		
		System.err.println("WS Agence is ready");
		
//		System.out.println(asui.ConsultationOffre(520, "Nice", 3, df.parse("10-12-2022"), df.parse("10-12-2022")));
	}

}
