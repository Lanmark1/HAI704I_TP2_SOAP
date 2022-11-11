package agence.web.service.client;

import java.net.MalformedURLException; 
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;

import agence.web.consultationWS.Offre;
import agence.web.reservationWS.ExceptionGetReference_Exception;
import agence.web.reservationWS.InfosPersonnes;

@WebService
public interface IAgenceServiceUtilisateur {

	@WebMethod
	public String getImageURL(Offre o);
	
	@WebMethod
	public float Reservation(String agence, InfosPersonnes infos, int identifiant, Date dateDebut, Date dateFin) throws ParseException, DatatypeConfigurationException, ExceptionGetReference_Exception;
	
	
	@WebMethod
	public ArrayList<Offre> ConsultationOffre(String agence, float prixMax, String ville, int nbrEtoiles, Date dateDebut, Date dateFin, int nbrPersonnes) throws DatatypeConfigurationException;
	

	@WebMethod
	public ArrayList<String> getAgenceNames();
	
	@WebMethod
	public int getReferenceResa();
	
}
