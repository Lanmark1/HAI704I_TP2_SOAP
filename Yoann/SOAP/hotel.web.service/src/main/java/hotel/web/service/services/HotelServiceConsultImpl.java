package hotel.web.service.services;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;

@WebService(endpointInterface = "hotel.web.service.services.IHotelServiceConsult")
public class HotelServiceConsultImpl implements IHotelServiceConsult {
	
	private ArrayList<Offre> lstOffre;
	
	public HotelServiceConsultImpl() {}
	
	@WebMethod
	public ArrayList<Offre> getListeOffres(int identifiant, String password, LocalDate DateDebut, LocalDate DateFin, int nbrPersonnes) {	
		
		ArrayList<Offre> lstOffrebis = new ArrayList<Offre>();
		
		for (Offre e : lstOffre) {
			if(e.getDateDispo().isBefore(DateDebut)) {
				if(e.getNbrLits() > nbrPersonnes) {
					lstOffrebis.add(e);
				}
			}
		}
		
		return lstOffrebis;
	}

}
