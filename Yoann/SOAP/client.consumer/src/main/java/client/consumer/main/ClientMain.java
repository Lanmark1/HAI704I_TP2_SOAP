package client.consumer.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ClientMain {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:8080/agenceservice?wsdl");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		HotelServiceReservationImplService consultImpl = new HotelServiceReservationImplService(url);
//		IHotelServiceReservation proxy = consultImpl.getHotelServiceReservationImplPort();
		
		
	}

}
