package agence.web.service.publisher;

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
	public int Reservation(InfosPersonnes infos, Date dateDebut, Date dateFin) throws ParseException, DatatypeConfigurationException, ExceptionGetReference_Exception;
	
	
	@WebMethod
	public ArrayList<Offre> ConsultationOffre(int prixMax, String ville, int nbrEtoiles, Date dateDebut, Date dateFin) throws DatatypeConfigurationException;
	
	
}
