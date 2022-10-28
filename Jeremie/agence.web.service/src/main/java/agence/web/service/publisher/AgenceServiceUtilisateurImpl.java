package agence.web.service.publisher;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.jws.WebService;

import agence.web.service.client.Offre;
import agence.web.service.model.InfosPersonnes;

@WebService(endpointInterface = "agence.web.services.services.IAgenceServiceUtilisateur")
public class AgenceServiceUtilisateurImpl implements IAgenceServiceUtilisateur{

	@Override
	public void Reservation(InfosPersonnes infos, LocalDate dateDebut, LocalDate dateFin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Offre> ConsultationOffre(int prix, int ville, int nbrEtoiles, LocalDate dateDebut, LocalDate dateFin) {
		// TODO Auto-generated method stub
		return null;
	}

}
