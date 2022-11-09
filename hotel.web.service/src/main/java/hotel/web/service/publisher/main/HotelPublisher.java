package hotel.web.service.publisher.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.ws.Endpoint;

import hotel.web.service.model.Agence;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import hotel.web.service.model.InfosPersonnes;
import hotel.web.service.services.HotelServiceConsultImpl;
import hotel.web.service.services.HotelServiceReservationImpl;

public class HotelPublisher {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Hotel> hotels = getHotels();
		
		System.out.println(hotels.get(0).getListeChambres());
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		Endpoint.publish("http://localhost:8080/hotelserviceconsult", new HotelServiceConsultImpl(hotels));
		Endpoint.publish("http://localhost:8080/hotelservicereservation", new HotelServiceReservationImpl(hotels));
		InfosPersonnes ip = new InfosPersonnes();
		HotelServiceConsultImpl hsci = new HotelServiceConsultImpl(hotels);		
		HotelServiceReservationImpl hsri = new HotelServiceReservationImpl(hotels);
		
		System.err.println("WS Hotel is ready");
		
	}
	
	public static ArrayList<Hotel> getHotels() throws Exception{
		
		// Initialisation de la liste d'hotels
		
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		
		// Initialisation de la liste des chambres
		
		ArrayList<Offre> offresH1 = new ArrayList<Offre>();
		ArrayList<Offre> offresH2 = new ArrayList<Offre>();
		ArrayList<Offre> offresH3 = new ArrayList<Offre>();
		ArrayList<Offre> offresH4 = new ArrayList<Offre>();
		
		// Initialisation de la liste des agences partenaires
		
//		ArrayList<Agence> agencesPartenairesH1 = new ArrayList<Agence>();
//		ArrayList<Agence> agencesPartenairesH2 = new ArrayList<Agence>();
//		ArrayList<Agence> agencesPartenairesH3 = new ArrayList<Agence>();
//		ArrayList<Agence> agencesPartenairesH4 = new ArrayList<Agence>();
//		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		// Définitions des offres/chambres
		
		Offre of1h1 = new Offre(3, df.parse("10-10-2022"), 100 );
		Offre of2h1 = new Offre(2, df.parse("12-10-2022"), 80 );
		Offre of3h1 = new Offre(5, df.parse("07-10-2022"), 180 );
		Offre of4h1 = new Offre(8, df.parse("13-10-2022"), 250 );
		
		Offre of1h2 = new Offre(4, df.parse("10-10-2022"), 110 );
		Offre of2h2 = new Offre(6, df.parse("05-10-2022"), 160 );
		Offre of3h2 = new Offre(1, df.parse("13-10-2022"), 50 );
		Offre of4h2 = new Offre(7, df.parse("04-10-2022"), 210 );
		
		Offre of1h3 = new Offre(4, df.parse("10-10-2022"), 110 );
		Offre of2h3 = new Offre(6, df.parse("05-10-2022"), 160 );
		Offre of3h3 = new Offre(1, df.parse("13-10-2022"), 50 );
		Offre of4h3 = new Offre(7, df.parse("04-10-2022"), 210 );
		
		
		Offre of1h4 = new Offre(4, df.parse("10-10-2022"), 110 );
		Offre of2h4 = new Offre(6, df.parse("05-10-2022"), 160 );
		Offre of3h4 = new Offre(1, df.parse("13-10-2022"), 50 );
		Offre of4h4 = new Offre(7, df.parse("04-10-2022"), 210 );

		offresH1.addAll(Arrays.asList(
				of1h1,
				of2h1,
				of3h1,
				of4h1
		));
		offresH2.addAll(Arrays.asList(
				of1h2,
				of2h2,
				of3h2,
				of4h2
		));
		offresH3.addAll(Arrays.asList(
				of1h3,
				of2h3,
				of3h3,
				of4h3
		));
		offresH4.addAll(Arrays.asList(
				of1h4,
				of2h4,
				of3h4,
				of4h4
		));
	
		// Définitions des agences

		// Ajout des agences aux listes d'agences partenaires 


		
		// Défintions des hotels
		
		Hotel hotel1 = new Hotel("France", "Nice", "Rue de la tulipe", 12 , 6, 10, 40, 3, offresH1);
		Hotel hotel2 = new Hotel("France", "Montpellier", "Rue de la comedie", 13 , 34, 3, 30, 4, offresH2);
		Hotel hotel3 = new Hotel("France", "Paris", "Rue de Rivoli", 14 , 75, 20, 50, 2, offresH3);
		Hotel hotel4 = new Hotel("France", "Paris", "Rue Saint Dominique", 15 , 75, 22, 52, 5, offresH4);
		hotels.addAll(Arrays.asList(
				hotel1,
				hotel2,
				hotel3,
				hotel4
		));
		
		return hotels;
	}

}
