package hotel.web.service.publisher.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.ws.Endpoint;

import hotel.web.service.model.Agence;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import hotel.web.service.services.HotelServiceConsultImpl;
import hotel.web.service.services.HotelServiceReservationImpl;

public class HotelPublisher {

	public static void main(String[] args) throws Exception {
		ArrayList<Hotel> hotels = getHotels();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

		Endpoint.publish("http://localhost:8080/hotelserviceconsult", new HotelServiceConsultImpl(hotels));
		Endpoint.publish("http://localhost:8080/hotelservicereservation", new HotelServiceReservationImpl(hotels));

		HotelServiceConsultImpl hsci = new HotelServiceConsultImpl(hotels);		
		
		System.err.println("Server is ready");

	}
	
	public static ArrayList<Hotel> getHotels() throws Exception{
		
		// Initialisation de la liste d'hotels
		
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		
		// Initialisation de la liste des chambres
		
		ArrayList<Offre> offresH2 = new ArrayList<Offre>();
		ArrayList<Offre> offresH1 = new ArrayList<Offre>();
		
		// Initialisation de la liste des agences partenaires
		
		ArrayList<Agence> agencesPartenairesH1 = new ArrayList<Agence>();
		ArrayList<Agence> agencesPartenairesH2 = new ArrayList<Agence>();
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		// Définitions des offres/chambres
		
		Offre of1h1 = new Offre(3, df.parse("10-10-2022"), 100 );
		offresH1.add(of1h1);
		
		Offre of1h2 = new Offre(4, df.parse("10-10-2022"), 110 );
		offresH2.add(of1h2);
		
		// Définitions des agences
		
		Agence nomAgence1 = new Agence(34763, "Agence1", "PasswordAgence1");
		Agence nomAgence2 = new Agence(57500, "Agence2", "PasswordAgence2");
		Agence nomAgence3 = new Agence(13094, "Agence3", "PasswordAgence3");
		
		// Ajout des agences aux listes d'agences partenaires 
		
		agencesPartenairesH1.addAll(Arrays.asList(
				nomAgence1,
				nomAgence2
		));
		
		agencesPartenairesH2.addAll(Arrays.asList(
				nomAgence2,
				nomAgence3
		));
		
		// Défintions des hotels
		
		Hotel hotel1 = new Hotel("France", "Nice", "Rue de la tulipe", 12 , 34, 3, 30, 4, offresH1, agencesPartenairesH1);
		Hotel hotel2 = new Hotel("France", "Montpellier", "Rue de la comedie", 12 , 34, 3, 30, 4, offresH2, agencesPartenairesH2);
		hotels.addAll(Arrays.asList(
				hotel1,
				hotel2
		));
		
		return hotels;
	}

}
