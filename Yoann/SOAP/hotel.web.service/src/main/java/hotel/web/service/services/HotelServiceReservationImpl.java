package hotel.web.service.services;

import javax.jws.WebService;

@WebService(endpointInterface = "hotel.web.service.services.IHotelServiceReservation")
public class HotelServiceReservationImpl implements IHotelServiceReservation {

	private String reference;
	
	
	@Override
	public Boolean reservationValide() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReference() {
		return reference;
	}

}
