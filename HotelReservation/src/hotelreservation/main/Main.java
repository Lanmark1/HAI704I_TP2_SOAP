package hotelreservation.main;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import hotelreservation.Chambre;
import hotelreservation.Client;
import hotelreservation.Creneau;
import hotelreservation.Hotel;
import hotelreservation.Paiement;
import hotelreservation.Reservation;

public class Main {

	public static void main(String[] args) throws ParseException {
		
			LocalDate dateDispoc1 = LocalDate.parse("2022-10-25");
			
			LocalDate dateDispoc2 = LocalDate.parse("2022-10-28");
			
			Chambre H1ch1 = new Chambre(100, 3, dateDispoc1);
			Chambre H1ch2 = new Chambre(50, 2, dateDispoc2);
			
			Chambre H2ch1 = new Chambre(120, 3, dateDispoc1);
			Chambre H2ch2 = new Chambre(75, 2, dateDispoc2);
			
			
			ArrayList<Chambre> listeChambresh1 = new ArrayList<>();
			listeChambresh1.add(H1ch1);
			listeChambresh1.add(H1ch2);
			
			ArrayList<Chambre> listeChambresh2 = new ArrayList<>();
			listeChambresh1.add(H2ch1);
			listeChambresh1.add(H2ch2);
			
		
			// Création des hotels
		
			Hotel hotel1 = new Hotel("France", "Nice", "Rue de la tulipe", 12 , 34, 3, 30, 4, listeChambresh1);
			Hotel hotel2 = new Hotel("France", "Montpellier", "Place de la comedie", 14 , 34, 3, 30, 5, listeChambresh2);
			ArrayList <Hotel> listeHotels = new ArrayList<>();
			
			listeHotels.add(hotel1);
			listeHotels.add(hotel2);
			
			
			
			// Création d'un client
		
			Client c1  = new Client("Yoann", "REYNE");
						
			// Interaction utilisateur
		
			Scanner scanner = new Scanner(System.in);
			
	        System.out.println("Entrez une ville souhaitée : ");
	        String ville = scanner.nextLine();
	        
	        System.out.println("Entrez une date d'arrivée : ");
	        String SdateArrivee = scanner.nextLine();
	        LocalDate dateArrivee = LocalDate.parse(SdateArrivee);
	        
	        System.out.println("Entrez une date de départ : ");
	        String SdateDepart = scanner.nextLine();
	        LocalDate dateDepart = LocalDate.parse(SdateDepart);
	        
	        System.out.println("Entrez un prix minimum : ");
	        int prixMin = scanner.nextInt();
	        
	        System.out.println("Entrez un prix maximum : ");
	        int prixMax = scanner.nextInt();        
	        
	        System.out.println("Entrez le nombre d'étoiles souhaité : ");
	        int nbrEtoiles = scanner.nextInt();
	        
	        System.out.println("Entrez le nombre de personnes à héberger : ");
	        int nbrPersonnes = scanner.nextInt();
			
	        ArrayList<Chambre> chambreProposition = new ArrayList<>();
	        
	        for ( Hotel h : listeHotels) {
	        	if(h.getVille().equals(ville)) {
	        		if(h.getEtoiles() >= nbrEtoiles) {
	        			for ( Chambre c : h.getListeChambres()) {
	        				if(c.getPrix() >= prixMin && c.getPrix() <= prixMax) {
	        					if(c.getNbrlits() >= nbrPersonnes) {
	        						if(c.getDateDispo().isBefore(dateDepart)) {	
	        							chambreProposition.add(c);
	        						}
	        					}
	        				}
	        			}
	        				
	        		}
	        	}
	        
	        }
	       // Hotel 4 étoiles à Nice -> 2 chambres -> 100e et 50e la nuit -> 3 lits et 2 lits 
	       // Une chambre est prise du 2022-10-20 au 2022-10-27 et l'autre 2022-10-20 2022-11-15
	        
//	        System.out.println("Vous avez la possibilité de choisir : ");
	        System.out.println(chambreProposition);
	        
	        // RESERVATION 
	        
	        System.out.println("Souhaitez vous réserver ? Si oui mettez une chiffre entre 0 et " + " " + (chambreProposition.size() - 1) + " " + " sinon mettez -1");
	        
	        Paiement paiementC1 = new Paiement();
	        
	        int choix = scanner.nextInt();
	        if(choix != -1) {
	        	Reservation res = new Reservation(c1.getNom(), c1.getPrenom(), paiementC1, dateDepart);
	        	chambreProposition.get(choix).setDateDispo(dateDepart);
	        	System.out.println("Vous venez de réserver un hotel au prix de : " + chambreProposition.get(choix).getPrix());
	        	return;
	        }
	        else {
	        	System.out.println("Vous n'avez pas souhaiteer réserver");
	        	return;
	        }
	}
	
}
