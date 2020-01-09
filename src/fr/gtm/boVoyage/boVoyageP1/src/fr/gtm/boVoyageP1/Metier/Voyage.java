package fr.gtm.boVoyageP1.Metier;
import java.util.List;

public class Voyage {
	private String region;
	private String descriptif;
	private int id;
	private Formule formule;
	private int  nbVoyageurs;
	private List<Client> client;
	private List<Voyageur> voyageur;
	
	

	public Voyage(String region, String descriptif, int id, Formule formule, int nbVoyageurs, List<Voyageur> voyageur) {
		super();
		this.region = region;
		this.descriptif = descriptif;
		this.id = id;
		this.formule = formule;
		this.nbVoyageurs = nbVoyageurs;
		this.voyageur = voyageur;
	}



	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public int getId() {
		return id;
		
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public Formule getFormule() {
		return formule;
	}

	public void setFormule(Formule formules) {
		this.formule = formules;
	}


	public int getNbVoyageurs() {
		return nbVoyageurs;
	}

	
	public void setNbVoyageurs(int nbVoyageurs) {
		this.nbVoyageurs = nbVoyageurs;
	}


	

	public List<Voyageur> getVoyageur() {
		return voyageur;
	}



	public void setVoyageur(List<Voyageur> voyageur) {
		this.voyageur = voyageur;
	}



	public List<Client> getClient() {
		return client;
	}



	public void setClient(List<Client> client) {
		this.client = client;
	}


	public double getPrix() {  // méthode permettant de récupérer le prix d'une formule et de retourner ce prix
		double prix;
		prix = getFormule().getPrix();
		return prix; 
		}
		
		

}
