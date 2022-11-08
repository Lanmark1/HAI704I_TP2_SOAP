package hotelreservation;

import java.time.LocalDate;

public class Reservation {
	private String nomClient = null;
	private String prenomClient = null;
	private Paiement infospaiement = null;
	private LocalDate date;
	
	public Reservation(String nomClient, String prenomClient, Paiement infospaiement, LocalDate date) {
		this.setNomClient(nomClient);
		this.setPrenomClient(prenomClient);
		this.setInfospaiement(infospaiement);
		this.setDate(date);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Paiement getInfospaiement() {
		return infospaiement;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public void setInfospaiement(Paiement infospaiement) {
		this.infospaiement = infospaiement;
	}


}
