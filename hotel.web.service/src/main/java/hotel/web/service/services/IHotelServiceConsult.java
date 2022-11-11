package hotel.web.service.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.model.Agence;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.Offre;

@WebService
public interface IHotelServiceConsult {
	
	@WebMethod
	public String getImageURL(Offre o);
	
	@WebMethod
	public ArrayList<Hotel> getHotelsService();
	
	@WebMethod
	public ArrayList<Offre> getListeOffres(int identifiant, String password, String ville, float prix, Date DateDebut, Date DateFin, int nbrPersonnes, int nbrEtoiles);
	
}
