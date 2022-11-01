package hotel.web.service.model.bdd;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InfosPersonnes {

	private String nom;
	private Paiement paiement;

	public InfosPersonnes() {}
	
	public InfosPersonnes(String nom, Paiement paiement) {
		this.setNom(nom);
		this.setPaiement(paiement);
	}


	public Paiement getPaiement() {
		return paiement;
	}


	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
}
