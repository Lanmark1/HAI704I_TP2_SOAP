package hotel.web.service.publisher.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.ws.Endpoint;

import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import hotel.web.service.services.HotelServiceConsultImpl;

public class HotelPublisher {

	public static void main(String[] args) {
//		ArrayList<Hotel> hotels = getHotels();
//		System.out.println(hotels);
		Endpoint.publish("http://localhost:8080/hotelserviceconsult", new HotelServiceConsultImpl());
		System.err.println("Server is ready");
		
	
	}
	/*
	public static ArrayList<Hotel> getHotels(){
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		
		
		ArrayList<Offre> offresH2 = new ArrayList<Offre>();
		ArrayList<Offre> offresH1 = new ArrayList<Offre>();
		
		Offre of1h1 = new Offre(1000, 3, LocalDate.parse("2022-10-10"), 100 );
		offresH1.add(of1h1);
		
		Offre of1h2 = new Offre(1001, 4, LocalDate.parse("2022-10-10"), 110 );
		offresH2.add(of1h2);
		
		Hotel hotel1 = new Hotel("France", "Nice", "Rue de la tulipe", 12 , 34, 3, 30, 4, offresH1);
		Hotel hotel2 = new Hotel("France", "Montpellier", "Rue de la comedie", 12 , 34, 3, 30, 4, offresH2);
		hotels.addAll(Arrays.asList(
				hotel1,
				hotel2
		));
		return hotels;
	}
*/
}
