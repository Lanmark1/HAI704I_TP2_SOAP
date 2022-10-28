package hotel.web.service.publisher.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.ws.Endpoint;

import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;
import hotel.web.service.services.HotelServiceConsultImpl;

public class HotelPublisher {

	public static void main(String[] args) throws Exception {
		ArrayList<Hotel> hotels = getHotels();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println(hotels.get(0).getOffreById(1000).getDateDispo().before(df.parse("10-10-2022")));
		HotelServiceConsultImpl hsci = new HotelServiceConsultImpl(hotels);
		System.out.println(hsci.getListeOffres(15051, "Nice", df.parse("11-10-2022") ,df.parse("11-10-2022"), 3));
		Endpoint.publish("http://localhost:8080/hotelserviceconsult", new HotelServiceConsultImpl(hotels));
		System.err.println("Server is ready");
		
		
	
	}
	
	public static ArrayList<Hotel> getHotels() throws Exception{
		
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		ArrayList<Offre> offresH2 = new ArrayList<Offre>();
		ArrayList<Offre> offresH1 = new ArrayList<Offre>();
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		Offre of1h1 = new Offre(1000, 3, df.parse("10-10-2022"), 100 );
		offresH1.add(of1h1);
		
		Offre of1h2 = new Offre(1001, 4, df.parse("10-10-2022"), 110 );
		offresH2.add(of1h2);
		
	
		
		Hotel hotel1 = new Hotel("France", "Nice", "Rue de la tulipe", 12 , 34, 3, 30, 4, offresH1);
		Hotel hotel2 = new Hotel("France", "Montpellier", "Rue de la comedie", 12 , 34, 3, 30, 4, offresH2);
		hotels.addAll(Arrays.asList(
				hotel1,
				hotel2
		));
		return hotels;
	}

}
