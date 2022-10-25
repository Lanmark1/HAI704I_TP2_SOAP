package agence.web.service.services;

import java.time.LocalDate;

import javax.jws.WebService;

@WebService(endpointInterface = "agence.web.services.services.IAgenceServiceUtilisateur")
public class AgenceServiceUtilisateurImpl implements IAgenceServiceUtilisateur{

	@Override
	public void Reservation(InfosPersonnes infos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Offre> ConsultationOffre(int prix, int ville, int nbrEtoiles, LocalDate dateDebut, LocalDate dateFin) {
		// TODO Auto-generated method stub
		return null;
	}

}
