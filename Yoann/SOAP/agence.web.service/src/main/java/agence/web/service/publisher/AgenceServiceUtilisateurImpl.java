package agence.web.service.publisher;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import agence.web.service.client.HotelServiceConsultImplService;
import agence.web.service.client.IHotelServiceConsult;
import agence.web.service.client.Offre;
import agence.web.service.model.InfosPersonnes;

@WebService(endpointInterface = "agence.web.services.services.IAgenceServiceUtilisateur")
public class AgenceServiceUtilisateurImpl implements IAgenceServiceUtilisateur{

	
	
	
	@Override
	public void Reservation(InfosPersonnes infos, Date dateDebut, Date dateFin) throws ParseException, DatatypeConfigurationException {
		/*GregorianCalendar calendar = new GregorianCalendar();

        calendar.setTime(date);
        System.out.println(calendar.getTime());

		URL url;
		try {
			url = new URL("http://localhost:8080/hotelserviceconsult?wsdl");
			HotelServiceConsultImplService consultImpl = new HotelServiceConsultImplService(url);
			IHotelServiceConsult proxy = consultImpl.getHotelServiceConsultImplPort();
			
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(dateDebut);
			
			return proxy.ge
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		
		*/
		
		
	}

	@Override
	public ArrayList<Offre> ConsultationOffre(int prix, String ville, int nbrEtoiles, Date dateDebut, Date dateFin) throws DatatypeConfigurationException {
		/*
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
			return proxy.getListeOffres(15051, ville , dateDebutGC, dateFinGC, nbrEtoiles);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	*/
}
