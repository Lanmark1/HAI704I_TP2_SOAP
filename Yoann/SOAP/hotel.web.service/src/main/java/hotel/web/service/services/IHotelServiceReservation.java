package hotel.web.service.services;

import javax.jws.WebService;

@WebService
public interface IHotelServiceReservation {

	public Boolean reservationValide();
	public String getReference();
	
	
	
}
