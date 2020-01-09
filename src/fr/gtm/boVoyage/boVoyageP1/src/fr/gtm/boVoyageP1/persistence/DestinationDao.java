package fr.gtm.boVoyageP1.persistence;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import fr.gtm.boVoyageP1.Metier.Destination;
import fr.gtm.boVoyageP1.Metier.Formule;

public class DestinationDao {
	long id;
	private List<Destination> destinations = new ArrayList<Destination>();

	public void createDestination(Destination... destination) {
		for (Destination d : destinations) {
			this.destinations.add(d);
		}
	}

	public void deleteDestination(Destination... destination) {
		for (Destination d : destinations) {
			this.destinations.remove(d);
		}
	}

	// Entrer une nouvelle destination contenant un id existant,
	// celle ci doit contenir un id existant
	// mais peut contenir des paramètres différents

	public Destination updateDestination(Destination destinationUnUpdated) {
		boolean exist = false;
		Destination destinationUpdated;

		for (Destination destination : destinations) {
			if (destination.getId() == destinationUnUpdated.getId()) {
				destinationUpdated = destinationUnUpdated;
				deleteDestination(destination);
				createDestination(destinationUpdated);
				System.out.println("Votre destination a bien été changé");
				exist = true;
				return destinationUpdated;
			}
		}
		if (exist == false) {
			System.out.println("Votre destination est inconu, veuillez la corrigé");
		}
		return destinationUnUpdated;
	}

	public Destination findDestinationById(long id) {
		Destination destinationId = null;
		for (Destination destination : destinations) {
			if (destination.getId() == id) {
				System.out.println("Votre destination à été trouvé" + destination);
				destinationId = destination;
			}
		}
		if (destinationId.getId() == 0) {
			System.out.println("Votre destination est inconu, veuillez la corrigé");
		}

		return destinationId;
	}

	public Formule findFormuleById(long id) {
		Formule formuleId = null;
		for (Destination destination : destinations) {
			if (destination.getFormule().getId() == id) {
				System.out.println("Votre destination à été trouvé" + destination.getFormule());
				formuleId = destination.getFormule();
			}
		}
		if (formuleId.getId() == 0) {
			System.out.println("Votre formule est inconu, veuillez la corrigé");
		}
		return formuleId;
	}

	public List<Destination> findAllDestinations() {
		System.out.println("Voici la liste des destinations");
		for (Destination destination : destinations) {
			System.out.println(destination);
		}
		return destinations;
	}

}
