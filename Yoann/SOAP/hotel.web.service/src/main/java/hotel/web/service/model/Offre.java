package hotel.web.service.model;

import java.util.Date;

public class Offre {
	private int identifiant;
	private int nbrLits;
	private Date dateDispo;
	private int prix;

	
	
	public Offre() {}
	
	public Offre(int identifiant, int nbrLits, Date dateDispo, int prix) {
		setIdentifiant(identifiant);
		setNbrLits(nbrLits);
		setDateDispo(dateDispo);
		setPrix(prix);
	}

	public int getIdentifiant() {
		return identifiant;
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
