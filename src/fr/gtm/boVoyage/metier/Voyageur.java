package fr.gtm.boVoyage.metier;

import java.time.LocalDate;

public class Voyageur {
	private String civilite;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String numero;
	private long id;
	
	
	
	
	
	

	public String getCivilite() {
		return civilite;
	}





	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}





	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	public String getPrenom() {
		return prenom;
	}





	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}





	public LocalDate getDateNaissance() {
		return dateNaissance;
	}





	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}





	public String getNumero() {
		return numero;
	}





	public void setNumero(String numero) {
		this.numero = numero;
	}





	public long getId() {
		return id;
	}





	public void setId(long id) {
		this.id = id;
	}





	public Voyageur() {
		// TODO Auto-generated constructor stub
	}

}
