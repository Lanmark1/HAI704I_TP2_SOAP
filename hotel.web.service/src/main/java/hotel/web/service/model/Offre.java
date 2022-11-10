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
//	private ArrayList<Hotel> hotel;
	private Hotel hotel;
	
	
	public Offre() {}
	
	public Offre(int nbrLits, Date dateDispo, int prix) {
		identifiant++;
		setIdentifiant(identifiant);
		setNbrLits(nbrLits);
		setDateDispo(dateDispo);
		setPrix(prix);
		hotel = new Hotel();
	}

	public int getIdentifiant() {
		return identifiantOffre;
	}
	

	public int getIdentifiantOffre() {
		return identifiantOffre;
	}

	public void setIdentifiantOffre(int identifiantOffre) {
		this.identifiantOffre = identifiantOffre;
	}

//	public void setHotel(ArrayList<Hotel> hotel) {
//		this.hotel = hotel;
//	}

	public void setIdentifiant(int identifiant) {
		this.identifiantOffre = identifiant;
	}

	public int getNbrLits() {
		return nbrLits;
	}

	public void setNbrLits(int nbrLits) {
		this.nbrLits = nbrLits;
	}

//	public ArrayList<Hotel> getHotel() {
//		return hotel;
//	}
	
	public Date getDateDispo() {
		return dateDispo;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
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

//	public void addHotels(Hotel hotel) {
//		this.hotel.add(hotel);
//		
//	}
	
	public int getEtoiles() {
		return hotel.getEtoiles();
	}
	
}
