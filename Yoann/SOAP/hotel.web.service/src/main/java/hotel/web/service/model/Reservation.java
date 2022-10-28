package hotel.web.service.model;

import java.util.Date;

public class Reservation {

	
	private int identifiantReservation;
	private int identifiantOffre;
	private InfosPersonnes infosClient;
	private Date dateDebut;
	private Date dateFin;
	private static int cptIdentifiant = 0; 
	
	public Reservation(Hotel hotel, int identifiantOffre, InfosPersonnes infosClient, Date dateDebut, Date dateFin){
		
		this.identifiantReservation = cptIdentifiant;
		this.identifiantOffre = identifiantOffre;
		this.infosClient = infosClient;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		cptIdentifiant++;
		hotel.getOffreById(identifiantOffre).setDateDispo(dateFin);
		
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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public static int getCptIdentifiant() {
		return cptIdentifiant;
	}

	public static void setCptIdentifiant(int cptIdentifiant) {
		Reservation.cptIdentifiant = cptIdentifiant;
	}
}