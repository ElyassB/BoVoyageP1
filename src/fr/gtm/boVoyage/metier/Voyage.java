package fr.gtm.boVoyage.metier;

public class Voyage {
	private String region;
	private String descriptif;
	private int id;
	private Formule formules;
	private int  nbVoyageurs;
	private String client;
	private String voyageur;
	
	
	
	
	public String getVoyageur() {
		return voyageur;
	}




	public void setVoyageur(String voyageur) {
		this.voyageur = voyageur;
	}




	public Formule getFormule() {
		return formules;
	}




	public void setFormule(Formule formule) {
		this.formules = formule;
	}




	public double getPrix() {  // méthode permettant de récupérer le prix d'une formule et de retourner ce prix
		double prix;
		prix = getFormule().getPrix();
		return prix; 
		}
		
		
	
	
	  
	

	public Voyage() {
		// TODO Auto-generated constructor stub
	}

}
