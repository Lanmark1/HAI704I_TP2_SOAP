help :
	@echo "Les commandes :"
	@echo "\t- compiler : make compile"
	@echo "\t- lancer les WS : \n\t\t- make pHotelWS\n\t\t- make pAgenceWS"
	@echo "\t- lancer le client : make gui"
	@echo "\t- afficher cette page d'aide: make help (option par défaut)"

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

gui : # utilisation du WS de l'agence par le client (GUI)
	(cd client.consumer ; mvn exec:java@InterfaceGUI)