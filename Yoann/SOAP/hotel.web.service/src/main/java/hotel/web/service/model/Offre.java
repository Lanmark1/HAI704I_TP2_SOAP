package hotel.web.service.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Offre {
	private static int identifiant=0;
	private int identifiantOffre;
	private int nbrLits;
	private Date dateDispo;
	private int prix;
	private ArrayList<Hotel> hotel;

	
	public Offre() {}
	
	public Offre(int nbrLits, Date dateDispo, int prix) {

		identifiant++;
		setIdentifiant(identifiant);
		setNbrLits(nbrLits);
		setDateDispo(dateDispo);
		setPrix(prix);
		this.hotel = new ArrayList<Hotel>();
	}

	public int getIdentifiant() {
		return identifiantOffre;
	}
	
	public int getEtoiles() {
		return hotel.get(0).getEtoiles();
	}

	public void setIdentifiant(int identifiant) {
		this.identifiantOffre = identifiant;
	}

	public int getNbrLits() {
		return nbrLits;
	}

	public void setNbrLits(int nbrLits) {
		this.nbrLits = nbrLits;
	}

	public Hotel getHotel() {
		return hotel.get(0);
	}
	
	public Date getDateDispo() {
		return dateDispo;
	}

	public void setDateDispo(Date dateDispo) {
		this.dateDispo = dateDispo;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void addHotels(Hotel hotel2) {
		this.hotel.add(hotel2);
		
	}
}
