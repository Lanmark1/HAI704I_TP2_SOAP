package agence.web.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import agence.web.consultationWS.Agence;
import agence.web.consultationWS.HotelServiceConsultImplService;
import agence.web.consultationWS.IHotelServiceConsult;
import agence.web.consultationWS.Offre;
import agence.web.reservationWS.ExceptionGetReference_Exception;
import agence.web.reservationWS.HotelServiceReservationImplService;
import agence.web.reservationWS.IHotelServiceReservation;
import agence.web.reservationWS.InfosPersonnes;
import agence.web.service.main.ReservationMain;

@WebService(endpointInterface = "agence.web.service.client.IAgenceServiceUtilisateur")
public class AgenceServiceUtilisateurImpl implements IAgenceServiceUtilisateur{

	public ArrayList<Agence> lstAgences;
	public int resID;
	
	public AgenceServiceUtilisateurImpl(ArrayList<Agence> agences) {
		this.lstAgences = agences;
	}
	
	@Override
	public float Reservation(String nameAgence, InfosPersonnes infos, int identifiantOffre, Date dateDebut, Date dateFin) throws ParseException, DatatypeConfigurationException, ExceptionGetReference_Exception {
		
		URL url;
		Agence agence = new Agence();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(dateDebut);
		XMLGregorianCalendar dateDebutGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		GregorianCalendar c2 = new GregorianCalendar();
		c2.setTime(dateFin);
		XMLGregorianCalendar dateFinGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(c2);
		
		try {
			url = new URL("http://localhost:8080/hotelservicereservation?wsdl");
			HotelServiceReservationImplService ResImpl = new HotelServiceReservationImplService(url);
			IHotelServiceReservation proxy = ResImpl.getHotelServiceReservationImplPort();
			for ( Agence a : lstAgences) {
				if(a.getLogin().equals(nameAgence)) {
					agence = a;
					continue;
				}
			}

			float prix = proxy.reservationValide(agence.getIdentifiant(), agence.getLogin(), agence.getMotdepasse(), identifiantOffre, infos, dateDebutGC, dateFinGC);
			resID = proxy.getReference();
			return prix;
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	@Override
	public ArrayList<Offre> ConsultationOffre(String nameAgence, float prix, String ville, int nbrEtoiles, Date dateDebut, Date dateFin, int nbrPersonnes) throws DatatypeConfigurationException {
		
		URL url;
		Agence agence = new Agence();
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(dateDebut);
		XMLGregorianCalendar dateDebutGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		GregorianCalendar c2 = new GregorianCalendar();
		c2.setTime(dateFin);
		XMLGregorianCalendar dateFinGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(c2);

        
		try {
			url = new URL("http://localhost:8080/hotelserviceconsult?wsdl");
			HotelServiceConsultImplService consultImpl = new HotelServiceConsultImplService(url);
			IHotelServiceConsult proxy = consultImpl.getHotelServiceConsultImplPort();
			
			for ( Agence a : lstAgences) {
				if(a.getLogin().equals(nameAgence)){
					agence = a;
					continue;
				}
			}
			
			return (ArrayList<Offre>) proxy.getListeOffres(agence.getIdentifiant(), agence.getMotdepasse(), ville , prix, dateDebutGC, dateFinGC, nbrPersonnes, nbrEtoiles);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<String> getAgenceNames() {
		ArrayList<String> names = new ArrayList<>();
		for (Agence a : lstAgences) {
			names.add(a.getLogin());
		}
		return names;
	}

	@Override
	public int getReferenceResa() {
		return resID;
	}
}
