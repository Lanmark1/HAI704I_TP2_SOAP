package hotelreservation;

public class Reservation {
	private String nomClient = null;
	private String prenomClient = null;
	private Paiement infospaiement = null;
	private Creneau creneau;
	
	public Reservation() {
		super();
		this.setCreneau(new Creneau());
	}
	
	public Reservation(String nomClient, String prenomClient, Paiement infospaiement, Creneau creneau) {
		this.setNomClient(nomClient);
		this.setPrenomClient(prenomClient);
		this.setInfospaiement(infospaiement);
		this.setCreneau(creneau);
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

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}
}
