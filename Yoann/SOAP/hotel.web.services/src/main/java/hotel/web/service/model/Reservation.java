package hotel.web.service.model;

import java.time.LocalDate;

import hotel.web.service.exception.ExceptionReservation;

public class Reservation {

	
	private int identifiantReservation;
	private int identifiantOffre;
	private InfosPersonnes infosClient;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private static int cptIdentifiant = 0; 
	
	public Reservation(int identifiantOffre, InfosPersonnes infosClient, LocalDate dateDebut, LocalDate dateFin){
		
		this.identifiantReservation = cptIdentifiant;
		this.identifiantOffre = identifiantOffre;
		this.infosClient = infosClient;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		cptIdentifiant++;
	}
	
	public int getIdentifiantReservation() {
		return identifiantReservation;
	}

	public void setIdentifiantReservation(int identifiantReservation) {
		this.identifiantReservation = identifiantReservation;
	}

	public int getIdentifiantOffre() {
		return identifiantOffre;
	}

	public void setIdentifiantOffre(int identifiantOffre) {
		this.identifiantOffre = identifiantOffre;
	}

	public InfosPersonnes getInfosClient() {
		return infosClient;
	}

	public void setInfosClient(InfosPersonnes infosClient) {
		this.infosClient = infosClient;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public static int getCptIdentifiant() {
		return cptIdentifiant;
	}

	public static void setCptIdentifiant(int cptIdentifiant) {
		Reservation.cptIdentifiant = cptIdentifiant;
	}
}