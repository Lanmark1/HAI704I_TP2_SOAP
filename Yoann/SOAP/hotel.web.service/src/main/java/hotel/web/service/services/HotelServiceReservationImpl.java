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
	public Boolean reservationValide(int identifiantAgence, String login, String password, int identifiantOffre, InfosPersonnes infosPersonne, Date dateDebut, Date dateFin) {

		// Si condition vérifié : 

		Hotel hotel = null;
		
		for (Hotel h : lstHotels) {
			if(h.getOffreById(identifiantOffre) != null) {
				hotel = h;
				continue;
			}
		}
		if(res == null) {
			res = new Reservation(hotel, identifiantOffre, infosPersonne, dateDebut, dateFin);
			return true;
		}
		
		return false;
	}
	
	@WebMethod
	public int getReference() throws ExceptionGetReference {
		if(res == null) {
			throw new ExceptionGetReference("Aucune réservation n'a encore eu lieu");
		}
		return res.getIdentifiantReservation();
	}


	

}
