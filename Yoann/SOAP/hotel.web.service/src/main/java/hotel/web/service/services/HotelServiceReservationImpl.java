package hotel.web.service.services;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.model.InfosPersonnes;
import hotel.web.service.model.Offre;
import hotel.web.service.model.Reservation;

@WebService(endpointInterface = "hotel.web.service.services.IHotelServiceReservation")
public class HotelServiceReservationImpl implements IHotelServiceReservation {
	
	ArrayList<Offre> lstOffre;
	
	
	public HotelServiceReservationImpl() {};
	
	
	@WebMethod
	public Boolean reservationValide(int identifiantAgence, String login, String password, int identifiantOffre, InfosPersonnes infosPersonne, LocalDate dateDebut, LocalDate dateFin) {
		// Condition
		
		// Si condition vérifié : 
			Reservation res = new Reservation(identifiantOffre, infosPersonne, dateDebut, dateFin);
			return true;
	}
	
	@WebMethod
	public String getReference() {
		return this.getReference();
	}


	

}
