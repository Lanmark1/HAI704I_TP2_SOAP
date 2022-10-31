package hotel.web.service.repository;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.JSONStringer;

import hotel.web.service.model.Hotel;

public class HotelRepositoryImpl implements IHotelRepository {

	private ArrayList<Hotel> hotels;
	

	
	public HotelRepositoryImpl() {
//        Object ob = new JSONStringer().parse(new FileReader("JSONFile.json"));

		hotels = new ArrayList<>();
		
	}
	
	
}
