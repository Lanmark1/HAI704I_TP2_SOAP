package hotel.web.service.services;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.model.Hotel;
import hotel.web.service.model.InfosPersonnes;
import hotel.web.service.model.Reservation;

@WebService(endpointInterface = "hotel.web.service.services.IHotelServiceReservation")
public class HotelServiceReservationImpl implements IHotelServiceReservation {
	
	Reservation res; 
	
	public HotelServiceReservationImpl() {}
	
	@WebMethod
	public Boolean reservationValide(int identifiantAgence, String login, String password, Hotel hotel, int identifiantOffre, InfosPersonnes infosPersonne, Date dateDebut, Date dateFin) {

		// Si condition vérifié : 
		res = new Reservation(hotel, identifiantOffre, infosPersonne, dateDebut, dateFin);
		return true;
	}
	
	@WebMethod
	public int getReference() {
		return this.res.getIdentifiantReservation();
	}


	

}
