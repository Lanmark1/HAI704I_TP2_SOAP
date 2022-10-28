package agence.web.service.model;

import java.time.LocalDate;

public class Paiement {
	
	private LocalDate dateExpiration;
	private String numeroCarte;
	private int cvv;
	
	public Paiement(String numeroCarte, LocalDate dateExpiration, int cvv) {
		this.setNumeroCarte(numeroCarte);
		this.setDateExpiration(dateExpiration);
		this.setCvv(cvv);
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
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
