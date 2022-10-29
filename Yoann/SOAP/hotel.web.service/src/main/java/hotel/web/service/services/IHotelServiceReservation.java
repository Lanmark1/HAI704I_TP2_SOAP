package hotel.web.service.services;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import hotel.web.service.exception.ExceptionGetReference;
import hotel.web.service.model.Hotel;
import hotel.web.service.model.InfosPersonnes;

@WebService
public interface IHotelServiceReservation {

	@WebMethod
	public Boolean reservationValide(int identifiantAgence, String login, String password, int identifiantOffre, InfosPersonnes infosPersonne, Date dateDebut, Date dateFin);

	@WebMethod
	public int getReference() throws ExceptionGetReference;
	
	
	
}
