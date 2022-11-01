package hotel.web.service.publisher.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException, org.json.simple.parser.ParseException {

		JSONParser parser = new JSONParser();
		FileReader file = new FileReader("../bdd.json");
		Object unitsObj = parser.parse(file);
		JSONArray array = new JSONArray();
		array.add(unitsObj);
		
		for (Object o : array) {
			JSONObject hotel = (JSONObject) o;
			for (Object h : (JSONArray) hotel.get("Hotel")) {
				JSONObject hotelDetails = (JSONObject) h;
				System.out.println(hotelDetails);
			}
		}
		file.close();
	}	
	

}



