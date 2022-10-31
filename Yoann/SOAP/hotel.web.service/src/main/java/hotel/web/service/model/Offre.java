package hotel.web.service.model;

import java.util.Date;

public class Offre {
	private int identifiant;
	private int nbrLits;
	private Date dateDispo;
	private int prix;
	private Hotel hotel;
	
	public Offre() {}
	
	public Offre(int nbrLits, Date dateDispo, int prix) {
		identifiant++;
		setIdentifiant(identifiant);
		setNbrLits(nbrLits);
		setDateDispo(dateDispo);
		setPrix(prix);
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public Hotel getHotel() {
		return hotel;
	}
	
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public int getNbrLits() {
		return nbrLits;
	}

	public void setNbrLits(int nbrLits) {
		this.nbrLits = nbrLits;
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
}
