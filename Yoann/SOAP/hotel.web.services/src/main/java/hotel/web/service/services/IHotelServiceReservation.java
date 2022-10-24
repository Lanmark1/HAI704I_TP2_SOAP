package hotel.web.service.services;

import java.time.LocalDate;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.model.InfosPersonnes;

@WebService
public interface IHotelServiceReservation {

	@WebMethod
	public Boolean reservationValide(int identifiantAgence, String login, String password, int identifiantOffre, InfosPersonnes infosPersonne, LocalDate dateDebut, LocalDate dateFin);

	@WebMethod
	public String getReference();
	
	
	
}
