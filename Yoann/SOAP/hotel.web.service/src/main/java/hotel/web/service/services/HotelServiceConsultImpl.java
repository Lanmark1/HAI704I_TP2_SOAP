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
		
		// On parcourt la liste des hotels
		
		// Pour chaque offre on vérifie qu'elle est dispo
		
		// Pour chaque offre on vérifie que le nombre de lits est supérieur au nombre de personnes
		
		// Si oui, on ajoute à notre liste d'offres si elle n'est pas déjà ajoutée.

		for (Hotel h : lstHotels) {
			for (Offre e : h.getListeChambres()) {
				if(e.getDateDispo().before(DateDebut)) {
					if(e.getNbrLits() >= nbrPersonnes) {
						if(!lstOffre.contains(e)) {
							lstOffre.add(e);
							}
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
