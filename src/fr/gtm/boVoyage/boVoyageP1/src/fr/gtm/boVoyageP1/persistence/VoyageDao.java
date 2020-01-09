package fr.gtm.boVoyageP1.persistence;

import java.util.ArrayList;
import java.util.List;
import javax.print.attribute.standard.Destination;

import fr.gtm.boVoyageP1.Metier.Client;
import fr.gtm.boVoyageP1.Metier.Formule;
import fr.gtm.boVoyageP1.Metier.Voyage;
import fr.gtm.boVoyageP1.Metier.Voyageur;

public class VoyageDao {

	private List<Voyage> voyages = new ArrayList<Voyage>();
	private List<Voyage> voyagesClient = new ArrayList<Voyage>();
	private List<Voyage> voyagesVoyageur = new ArrayList<Voyage>();

	public void createVoyage(Voyage... voyage) {
		for (Voyage v : voyages) {
			this.voyages.add(v);
		}
	}

	public void deleteVoyage(Voyage... voyage) {
		for (Voyage v : voyages) {
			this.voyages.remove(v);
		}
	}

	// entrer un nouveau voyage contenant un id existant,
	// celui ci doit contenir un id existant
	// mais peut contenir des paramètres différents

	public Voyage updateVoyage(Voyage voyageUnUpdated) {
		boolean exist = false;
		Voyage voyageUpdated = null;
		for (Voyage voyage : voyages) {
			if (voyage.getId() == voyageUnUpdated.getId()) {
				voyageUpdated = voyageUnUpdated;
				deleteVoyage(voyage);
				createVoyage(voyageUpdated);
				System.out.println("Votre destination a bien été changé");
				exist = true;
			}
		}
		if (exist == false) {
			System.out.println("Votre destination est inconu, veuillez la corrigé");
		}
		return voyageUpdated;
	}

	public Voyage findVoyageById(long id) {
		boolean exist = false;
		Voyage voyageId = null;
		for (Voyage voyage : voyages) {
			if (voyage.getId() == id) {
				System.out.println("Votre destination à été trouvé" + voyage);
				voyageId = voyage;
				exist = true;
				break;
			}
		}
		if (exist == false) {
			System.out.println("Votre destination est inconu, veuillez la corriger");

		}
		return voyageId;
	}

	public List<Voyage> findVoyagesByClient(Client client) {
		System.out.println("Voici la liste des voyages du client");
		boolean exist = false;
		for (Voyage v : voyages) {
			for (Client c : v.getClient()) {
				if (c == client) {
					voyagesClient.add(v);
					System.out.println(v);
					exist = true;
				}
			}
		}
		if (exist == false) {
			System.out.println("Ce client ne possède pas de voyage");
		}
		return voyagesClient;
	}

	public List<Voyage> findVoyagesByVoyageur(Voyageur voyageur){
		System.out.println("Voici la liste des voyages du voyageur");
		for (Voyage voyage : voyages) {
			for(Voyageur voyageursDuVoyage : voyage.getVoyageur()) {
				if (voyageur == voyageursDuVoyage) {
					this.voyagesVoyageur.add(voyage);
					System.out.println(voyage);
			}
		}}
		return voyagesVoyageur;
}
}