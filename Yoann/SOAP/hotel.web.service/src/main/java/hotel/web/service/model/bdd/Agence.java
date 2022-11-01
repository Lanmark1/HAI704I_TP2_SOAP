package hotel.web.service.model.bdd;

import java.util.ArrayList;

public class Agence {
	
	private int identifiant;
	private String login;
	private String motdepasse;
	private ArrayList<Hotel> hotelpartenaires;
	
	public Agence(int identifiant, String login, String motdepasse) {
		this.setIdentifiant(identifiant);
		this.setLogin(login);
		this.setMotdepasse(motdepasse);
		this.hotelpartenaires = new ArrayList<Hotel>();
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void addHotels(Hotel h) {
		this.hotelpartenaires.add(h);
	}
	
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getLogin() {
		return login;
	}
	
	public String getMotdepasse() {
		return motdepasse;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	
}
