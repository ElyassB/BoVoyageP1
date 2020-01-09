package fr.gtm.boVoyage.metier;

import java.time.LocalDate;

public class Formule {
	private String nom;
	private int nbPlaces;
	private double prix;
	private String description;
	private long id;
	private LocalDate aller;
	private LocalDate retour; 
	private String voyage;
	private String Destination;
	
	
	
	public Formule (double prix) {
		this.prix = prix;
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getAller() {
		return aller;
	}
	public void setAller(LocalDate aller) {
		this.aller = aller;
	}
	public LocalDate getRetour() {
		return retour;
	}
	public void setRetour(LocalDate retour) {
		this.retour = retour;
	}
	public String getVoyage() {
		return voyage;
	}
	public void setVoyage(String voyage) {
		this.voyage = voyage;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
	
	
	
	
	
	
	

}
