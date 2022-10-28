compile:
	(cd hotel.web.service ; mvn compile ; mvn exec:java@HotelPublisher)
	
publish:
	wsimport -keep -p "web.service.client" "http://localhost:8080/hotelserviceconsult?wsdl"
	rm web/service/client/LocalDate*
	cp web/service/client/*.java hotel.web.service.client/src/main/java/hotel/web/service/test/