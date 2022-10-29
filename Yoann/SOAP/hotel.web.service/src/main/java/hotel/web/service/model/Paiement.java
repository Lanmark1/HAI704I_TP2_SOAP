package hotel.web.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Paiement {
	
	private String dateExpiration;
	private String numeroCarte;
	private int cvv;
	
	public Paiement() {};
	
	public Paiement(String numeroCarte, String dateExpiration, int cvv) {
		this.setNumeroCarte(numeroCarte);
		this.setDateExpiration(dateExpiration);
		this.setCvv(cvv);
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
}
