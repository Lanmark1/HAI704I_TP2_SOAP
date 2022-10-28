package hotel.web.service.services;

import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;

@WebService(endpointInterface = "hotel.web.service.services.IHotelServiceConsult")
public class HotelServiceConsultImpl implements IHotelServiceConsult {
	
	private ArrayList<Offre> lstOffre;
	private ArrayList<Hotel> lstHotels;
	
	public HotelServiceConsultImpl(ArrayList<Hotel> hotels) {
		this.lstHotels = hotels; 
		lstOffre = new ArrayList<Offre>();	
	}
	
	
	@WebMethod
	public ArrayList<Offre> getListeOffres(int identifiant, String password, Date DateDebut, Date DateFin, int nbrPersonnes) {	
		System.out.println(lstHotels);
		for (Hotel h : lstHotels) {
			for (Offre e : h.getListeChambres()) {
				if(e.getDateDispo().before(DateDebut)) {
					if(e.getNbrLits() > nbrPersonnes) {
						lstOffre.add(e);
					}
				}
			}
		}	
		return lstOffre;
	}

	@WebMethod
	public ArrayList<Hotel> getHotelsService() {
		return lstHotels;
	}

}
