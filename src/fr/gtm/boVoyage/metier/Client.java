package fr.gtm.boVoyage.metier;

public class Client {
	
	private String nom;
	private String numero;
	private long id;
	private int age;
	private String voyage;
	
	
	
	
	
	
	

	public Client(String nom, String numero, int age, String voyage) {
		super();
		this.nom = nom;
		this.numero = numero;
		this.age = age;
		this.voyage = voyage;
	}





	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
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
	



	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public String getVoyage() {
		return voyage;
	}





	public void setVoyage(String voyage) {
		this.voyage = voyage;
	}





	public Client() {
		// TODO Auto-generated constructor stub
	}

}
