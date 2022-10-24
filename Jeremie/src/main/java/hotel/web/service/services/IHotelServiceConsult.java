package hotel.web.service.services;


import java.util.ArrayList;

import javax.jws.WebService;

@WebService
public interface IHotelServiceConsult {

	
	public ArrayList<Offre> getListeOffres();
	
}
