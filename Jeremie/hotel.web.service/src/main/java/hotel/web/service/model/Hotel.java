package hotel.web.service.model;


import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
	
	private String pays;
	private String ville;
	private String rue;
	private int numero;
	private int lieudit;
	private int longitude;
	private int latitude;
	private int etoiles;
	private ArrayList<Offre> listeChambres;
		
	public Hotel(String pays, String ville, String rue, int numero, int lieudit, int longitude, int latitude, int etoiles, ArrayList<Offre> listeChambres) {
		super();
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
		this.numero = numero;
		this.lieudit = lieudit;
		this.longitude = longitude;
		this.latitude = latitude;
		this.etoiles = etoiles;
		this.setListeChambres(listeChambres);
		
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getLieudit() {
		return lieudit;
	}

	
	
	public void setLieudit(int lieudit) {
		this.lieudit = lieudit;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getEtoiles() {
		return etoiles;
	}

	public void setEtoiles(int etoiles) {
		this.etoiles = etoiles;
	}

	public Offre getOffreById(int identifiant) {
		for (Offre o : listeChambres) {
			if(o.getIdentifiant() == identifiant) {
				return o;
			}
		}
		return null;
	}
	
	public ArrayList<Offre> getListeChambres() {
		return listeChambres;
	}

	public void setListeChambres(ArrayList<Offre> listeChambres) {
		this.listeChambres = listeChambres;
	}

}
