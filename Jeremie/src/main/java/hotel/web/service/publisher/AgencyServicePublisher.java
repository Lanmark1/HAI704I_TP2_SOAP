package hotel.web.service.publisher;

import javax.xml.ws.Endpoint;

import hotel.web.service.services.AgencyServiceImpl;


public class AgencyServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8082/agencywebservice", new AgencyServiceImpl());
		System.err.println("Server Ready");
	}
}