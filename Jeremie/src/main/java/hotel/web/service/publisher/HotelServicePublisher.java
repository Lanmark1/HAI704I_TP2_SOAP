package hotel.web.service.publisher;

import java.security.KeyPair;

import javax.xml.ws.Endpoint;

import hotel.web.service.services.HotelServiceConsultImpl;
import hotel.web.service.services.HotelServiceReservationImpl;

public class HotelServicePublisher {
	public static void main(String[] args) {
				
		Endpoint.publish("http://localhost:8080/hotelwebserviceconsult", new HotelServiceConsultImpl());
		Endpoint.publish("http://localhost:8081/hotelwebservicereservation", new HotelServiceReservationImpl());
		
		System.err.println("Server Ready");
	}
}
