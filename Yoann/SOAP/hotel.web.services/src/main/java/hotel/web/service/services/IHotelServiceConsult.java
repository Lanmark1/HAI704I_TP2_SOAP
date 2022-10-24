package hotel.web.service.services;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.model.Offre;

@WebService
public interface IHotelServiceConsult {

	@WebMethod
	public ArrayList<Offre> getListeOffres(int identifiant, String password, LocalDate DateDebut, LocalDate DateFin, int nbrPersonnes);
	
}
