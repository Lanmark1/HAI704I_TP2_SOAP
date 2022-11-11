package hotel.web.service.services;

import java.util.ArrayList; 
import java.util.Date;
import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.model.Agence;
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
	public String getImageURL(Offre o) {
		return "../hotel.web.service/images/room"+o.getChambreImageNum()+".jpg";
	}
	
	
	@WebMethod
	public ArrayList<Offre> getListeOffres(int identifiant, String password, String ville, float prix, Date DateDebut, Date DateFin, int nbrPersonnes, int nbrEtoiles) {	
		
		if(!lstOffre.isEmpty()) {
			lstOffre.clear();
		}
		
		// On parcourt la liste des hotels
		
		// Pour chaque offre on vérifie qu'elle est dispo
		
		// Pour chaque offre on vérifie que le nombre de lits est supérieur au nombre de personnes
		
		// Si oui, on ajoute à notre liste d'offres si elle n'est pas déjà ajoutée.
		float prixPartenaire;
		
		for (Hotel h : lstHotels) {
			
			if(h.getAgenceById(identifiant) != null) {
				prixPartenaire = (float) (prix * 1.1);
			}			
			
			else {
				prixPartenaire = prix;
			}
			
			if(h.getVille().equals(ville)) {
				if(h.getEtoiles() >= nbrEtoiles) {
				for (Offre e : h.getListeChambres()) {
					if(e.getPrix() <= prix) {
						if(e.getDateDispo().before(DateDebut)) {
							if(e.getNbrLits() >= nbrPersonnes) {
								if(!lstOffre.contains(e)) {
									lstOffre.add(e);
									}
							}
						}
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
