package hotel.web.service.services;

import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.exception.ExceptionGetReference;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.InfosPersonnes;
import hotel.web.service.model.Reservation;

@WebService(endpointInterface = "hotel.web.service.services.IHotelServiceReservation")
public class HotelServiceReservationImpl implements IHotelServiceReservation {
	
	Reservation res; 
	private ArrayList<Hotel> lstHotels;
	
	public HotelServiceReservationImpl(ArrayList<Hotel> hotels) {
		this.lstHotels = hotels; 
		res = null;
	}
	
	@WebMethod
	public float reservationValide(int identifiantAgence, String login, String password, int identifiantOffre, InfosPersonnes infosPersonne, Date dateDebut, Date dateFin) {

		Hotel hotel = null;
		
		// Je cherche l'hotel correspondant à l'offre
		
		for (Hotel h : lstHotels) {
			if(h.getOffreById(identifiantOffre) != null) {
				hotel = h;
				continue;
			}
		}
		
		// Si une réservation n'est pas existante alors je réserve ( on ne teste pas le cas où la date n'est pas disponible
		// car on a fourni les chambres répondant au dispo de l'utilisateur
		
		res = new Reservation(hotel, identifiantAgence, identifiantOffre, infosPersonne, dateDebut, dateFin);
		return res.getPrix();
	}
	
	@WebMethod
	public int getReference() throws ExceptionGetReference {
		
		// Si aucune réservation alors on renvoie une exception
		
		if(res == null) {
			throw new ExceptionGetReference("Aucune réservation n'a encore eu lieu");
		}
		
		// Sinon on renvoie l'identifiant de la réservation
		
		return res.getIdentifiantReservation();
	}


	

}
