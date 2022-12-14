package hotelreservation;

import java.time.LocalDate;
import java.util.AbstractMap;


public class Chambre{
		private int prix;
		private int nbrlits;
		private boolean libre;
		private LocalDate dateDispo;
		
		public Chambre() {};
		
		public Chambre(int prix, int nbrlits,LocalDate dateDispo) {
			this.prix = prix;
			this.nbrlits = nbrlits;
			this.dateDispo = dateDispo;
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

		public LocalDate getDateDispo() {
			return dateDispo;
		}

		public void setDateDispo(LocalDate dateDispo) {
			this.dateDispo = dateDispo;
		}

		

}