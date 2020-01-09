package fr.gtm.boVoyageP1.Metier;
import java.util.ArrayList;
import java.util.List;

public class Destination {
	private String nom;
	private Formule formule;
	private String description;
	private List<Image> images = new ArrayList<Image>();
	private long id;
	
	
	 
	public Destination(String description, String nom, long id) {
		super();
		this.description = description;
		this.nom = nom;
		this.id = id;
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

	public Formule getFormule() {
		return formule;
	}


	public void setFormule(Formule formule) {
		this.formule = formule;
	}




	@Override
	public String toString() {
		return "Destination [nom=" + nom + "]";
	}
	

	

}
