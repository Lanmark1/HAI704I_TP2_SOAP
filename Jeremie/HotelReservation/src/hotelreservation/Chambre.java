package hotelreservation;

import java.time.LocalDate;
import java.util.AbstractMap;


public class Chambre{
		private int prix;
		private int nbrlits;
		private boolean libre;
		private Reservation reservation;
		
		public Chambre() {};
		
		public Chambre(int prix, int nbrlits,Reservation reservation) {
			this.prix = prix;
			this.nbrlits = nbrlits;
			this.setReservation(reservation);
		}
		
		
		public int getNbrlits() {
			return nbrlits;
		}
		public void setNbrlits(int nbrlits) {
			this.nbrlits = nbrlits;
		}
		public int getPrix() {
			return prix;
		}
		public void setPrix(int prix) {
			this.prix = prix;
		}
		
		public boolean isLibre() {
			return libre;
		}
		
		public void setLibre(boolean libre) {
			this.libre = libre;
		}

		
		public boolean est_libre (Creneau creneau2){
			return getReservation().getCreneau().getsecondDate().isBefore(creneau2.getfirstDate()); 
		}

		public Reservation getReservation() {
			return reservation;
		}

		public void setReservation(Reservation reservation) {
			this.reservation = reservation;
		}

}