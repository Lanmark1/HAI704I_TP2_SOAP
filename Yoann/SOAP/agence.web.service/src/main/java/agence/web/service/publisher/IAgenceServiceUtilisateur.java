package agence.web.service.publisher;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import agence.web.service.client.Offre;
import agence.web.service.model.InfosPersonnes;

@WebService
public interface IAgenceServiceUtilisateur {

	@WebMethod
	public void Reservation(InfosPersonnes infos);
	
	
	@WebMethod
	public ArrayList<Offre> ConsultationOffre(int prix, int ville, int nbrEtoiles, LocalDate dateDebut, LocalDate dateFin);
	
	
}
