package agence.web.service.main;

import java.net.MalformedURLException;
import java.net.URL;

import agence.web.service.client.HotelServiceConsultImplService;
import agence.web.service.client.IHotelServiceConsult;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/hotelserviceconsult");
		HotelServiceConsultImplService consult = new HotelServiceConsultImplService(url);
		IHotelServiceConsult proxy = consult.getHotelServiceConsultImplPort();
//		System.out.println(proxy.getListeOffres(int, string, localDate, localDate2, int2).add(e));

	}

}
