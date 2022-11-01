package hotel.web.service.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONStringer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import hotel.web.service.model.bdd.Agence;
import hotel.web.service.model.bdd.Hotel;
import hotel.web.service.model.bdd.Offre;

public class HotelRepositoryImpl implements IHotelRepository  {

	private ArrayList<Hotel> hotels;
	
	JSONParser parser = new JSONParser();
	JSONArray array = new JSONArray();
	
	
	@SuppressWarnings("unchecked")
	public HotelRepositoryImpl() throws FileNotFoundException, IOException, ParseException {
	
		// PARSE FICHIER JSON
		
		Object unitsObj = parser.parse(new FileReader("../bdd.json"));
		array.add(unitsObj);
		
		// INITIALISATOIN DE LA LISTE D'HOTELS
		
		hotels = new ArrayList<>();
		
		// ON PARCOURT LE FICHIER JSON POUR AJOUTER LES HOTELS DANS LA LISTE hotels
		
		for (Object o : array) {
			JSONObject hotel = (JSONObject) o;

			for (Object h : (JSONArray) hotel.get("Hotel")) {
				
				ArrayList<Agence> agencePartenaires = new ArrayList<>();
				agencePartenaires.clear();
				
				ArrayList<Offre> offreChambres = new ArrayList<>();
				
				JSONObject hotelDetails = (JSONObject) h;
				
				for (Object a : (JSONArray) hotel.get("Agence")){
					JSONObject agenceDetails = (JSONObject) a;
					ArrayList<Integer> arr = (ArrayList<Integer>) agenceDetails.get("hotelPartenaires");
					for (int i = 0; i<arr.size();i++) {
						if(arr.get(i) == (Integer)hotelDetails.get("identifiant")) {
							agencePartenaires.add(new Agence( (Integer)agenceDetails.get("identifiant"), (String) agenceDetails.get("login"), (String) agenceDetails.get("motdepasse")));
						}
					}
				}

					ArrayList<Offre> arr = (ArrayList<Offre>) agenceDetails.get("hotelPartenaires");
					for (int i = 0; i<arr.size();i++) {
						agencePartenaires.add(new Agence( (Integer)agenceDetails.get("identifiant"), (String) agenceDetails.get("login"), (String) agenceDetails.get("motdepasse")));
						}
					}
				}
				
				
				Hotel hotelAdd = new Hotel((int)hotelDetails.get("identifiant"),(String)hotelDetails.get("pays"), (String)hotelDetails.get("ville"), (String)hotelDetails.get("rue"), (int)hotelDetails.get("numero"),(int)hotelDetails.get("lieu-dit") , (int)hotelDetails.get("longitude"), (int)hotelDetails.get("latitude"), (int)hotelDetails.get("etoiles"), (ArrayList<Offre>) hotelDetails.get("chambre") , agencePartenaires);
//				System.out.println(agenceDetails.get("identifiant").getClass());
				hotels.add(hotelAdd);
			
			}
		
		}
		
		
//		hotels.addAll(Arrays.asList(
//				hotel1,
//				hotel2
//		));
	}
	
	
}
