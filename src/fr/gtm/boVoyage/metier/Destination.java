package fr.gtm.boVoyage.metier;

import java.util.ArrayList;
import java.util.List;

public class Destination {
	private String nom;
	private Formule formule;
	private String description;
	private List<Image> images = new ArrayList<Image>();
	private long id;
	
	
	 
	public Destination(String description) {
		super();
		this.description = description;
	}
	
 
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	public List<Image> getImages() {
		return images;
	}


	public void setImages(List<Image> images) {
		this.images = images;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public Destination() {
		// TODO Auto-generated constructor stub
	}

}
