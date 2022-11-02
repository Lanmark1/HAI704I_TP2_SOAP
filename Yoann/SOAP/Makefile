compile :
	(cd hotel.web.service ; mvn compile)
	(cd agence.web.service ; mvn compile)
	(cd client.consumer ; mvn compile)

clean :
	(cd hotel.web.service ; mvn clean)
	(cd agence.web.service ; mvn clean)
	(cd client.consumer ; mvn clean)

pHotelWS : # publication du WS hotelconsult et hotelreservation de l'hotel
	(cd hotel.web.service ; mvn exec:java@HotelPublisher)

pAgenceWS : # publication du WS de l'agence
	(cd agence.web.service ; mvn exec:java@AgencePublisher)

reservation : # utilisation du WS reservation de l'hotel
	(cd agence.web.service ; mvn exec:java@ReservationMain)

consultation : # utilisation du WS consultation de l'hotel
	(cd agence.web.service ; mvn exec:java@ConsultationMain)

cli : # utilisation du WS de l'agence par le client
	(cd client.consumer ; mvn exec:java@ClientMain)

gui : # utilisation du WS de l'agence par le client (GUI)
	(cd client.consumer ; mvn exec:java@InterfaceGUI)