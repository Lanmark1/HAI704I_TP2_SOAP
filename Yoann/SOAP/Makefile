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

importHotel : # obtention des classes générées du WS hotelconsult et hotelreservation de l'hotel
	(cd agence.web.service/src/main/java ; wsimport -keep -p "agence.web.consultationWS" "http://localhost:8080/hotelserviceconsult?wsdl"; wsimport -keep -p "agence.web.reservationWS" "http://localhost:8080/hotelservicereservation?wsdl")
	(cd agence.web.service/src/main/java/agence/web/consultationWS ; rm *.class)
	(cd agence.web.service/src/main/java/agence/web/reservationWS ; rm *.class)
pAgenceWS : # publication du WS de l'agence
	(cd agence.web.service ; mvn exec:java@AgencePublisher)

importAgence : # obtention des classes générées du WS de l'agence
	(cd client.consumer/src/main/java ; wsimport -keep -p "client.consumer.service" "http://localhost:8088/agencewebservice?wsdl")
	(cd client.consumer/src/main/java/client/consumer/service ; rm *.class)

reservation : # utilisation du WS reservation de l'hotel
	(cd agence.web.service ; mvn exec:java@ReservationMain)

consultation : # utilisation du WS consultation de l'hotel
	(cd agence.web.service ; mvn exec:java@ConsultationMain)

cli : # utilisation du WS de l'agence par le client
	(cd client.consumer ; mvn exec:java@ClientMain)

gui : # utilisation du WS de l'agence par le client (GUI)
	(cd client.consumer ; mvn exec:java@InterfaceGUI)