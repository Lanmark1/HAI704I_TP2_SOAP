package hotel.web.service.services;


import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface = "hotel.web.service.services.IHotelServiceReservation")
public class HotelServiceReservationImpl implements IHotelServiceReservation {

	private String reference;
	private ArrayList<InfosClient> infosClients;
	
	public Boolean reservationValide(String agenceId, String login, String password, String offerId) {
		boolean validLogin = false;
		for (InfosClient client : infosClients) {
			if (client.getLogin().equals(login) && client.getPassword().equals(password)) {
				validLogin = true;
			}
		}
		
		if (!validLogin) return false;
		
		boolean agencyExists = false;
		for (InfosClient client : infosClients) {
			if (client.getIdAgence().equals(agenceId)) {
				agencyExists = true;
				break;
			}
		}
		
		if (!agencyExists) return false;
		
		boolean offerExists = false;
		for (InfosClient client : infosClients) {
			if (client.getOfferId().equals(offerId)) {
				offerExists = true;
			}
		}
		
		return offerExists;
	}

	public String getReference() {
		return reference;
	}

}
