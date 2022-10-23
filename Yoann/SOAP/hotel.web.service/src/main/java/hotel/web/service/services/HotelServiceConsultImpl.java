package hotel.web.service.services;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface = "hotel.web.service.services.IHotelServiceConsult")
public class HotelServiceConsultImpl implements IHotelServiceConsult {

	private ArrayList<Offre> lstOffre;
	
	
	@Override
	public ArrayList<Offre> getListeOffres() {
		return lstOffre;
	}

}
