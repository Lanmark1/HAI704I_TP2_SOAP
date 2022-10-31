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

@WebService(endpointInterface = "agence.web.services.services.IAgenceServiceUtilisateur")
public class AgenceServiceUtilisateurImpl implements IAgenceServiceUtilisateur{

	Agence a;
	
	public AgenceServiceUtilisateurImpl(Agence a) {
		this.a = a;
	}
	
	
	@Override
	public int Reservation(InfosPersonnes infos, int identifiantOffre, Date dateDebut, Date dateFin) throws ParseException, DatatypeConfigurationException, ExceptionGetReference_Exception {
		
		URL url;
		
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
			
			proxy.reservationValide(a.getIdentifiant(), a.getLogin(), "Password", identifiantOffre, infos, dateDebutGC, dateFinGC);
			return proxy.getReference();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	@Override
	public ArrayList<Offre> ConsultationOffre(int prix, String ville, int nbrEtoiles, Date dateDebut, Date dateFin) throws DatatypeConfigurationException {
		
		URL url;
		
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
			return (ArrayList<Offre>) proxy.getListeOffres(a.getIdentifiant(), ville , dateDebutGC, dateFinGC, nbrEtoiles);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
