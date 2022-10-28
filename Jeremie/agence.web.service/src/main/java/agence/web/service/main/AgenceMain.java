package agence.web.service.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

import agence.web.service.client.HotelServiceConsultImplService;
import agence.web.service.client.IHotelServiceConsult;




public class AgenceMain {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:8080/hotelserviceconsult?wsdl");
		HotelServiceConsultImplService consultImpl = new HotelServiceConsultImplService(url);
		IHotelServiceConsult proxy = consultImpl.getHotelServiceConsultImplPort();
		System.out.println(proxy.getListeOffres(15051, "Nice", LocalDate.parse("2022-10-11"), LocalDate.parse("2022-10-17"), 3));
		
	}

}
