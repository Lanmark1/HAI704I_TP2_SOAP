package hotel.web.service.services;

import java.time.LocalDate;

public class Offre {
	private int identifiant;
	private int nbrLits;
	private LocalDate dateDispo;
	private int prix;
	
	public Offre(int identifiant, int nbrLits, LocalDate dateDispo, int prix) {
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

	public LocalDate getDateDispo() {
		return dateDispo;
	}

	public void setDateDispo(LocalDate dateDispo) {
		this.dateDispo = dateDispo;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
}
