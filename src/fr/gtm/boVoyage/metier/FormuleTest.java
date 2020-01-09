package fr.gtm.boVoyage.metier;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class FormuleTest {
	
	LocalDate date1 = LocalDate.of(2020, 01, 01);
	LocalDate date2 = LocalDate.of(2020, 02, 01);

	Formule formule = new Formule("youpi", 54, 24.25, "ca va", date1, date2, "formule bien");
	
	



	@Test
	public void testGetId() {
		assertNotNull(formule.getId());
	}
	
	
	
	@Test
	public void testGetNom() {
		
		assertEquals("youpi", formule.getNom());
	}
	
	@Test
	public void testGetDescription() {
		
		assertEquals("ca va", formule.getDescription());
	}
	
	
	@Test
	public void testSetNom() {
		formule.setNom("Le Caire");
		assertEquals("Le Caire", formule.getNom());
	}
	
	
	@Test
	public void testSetDescription() {
		formule.setDescription("il fait plus chaud finalement");
		assertEquals("il fait plus chaud finalement", formule.getDescription());
	}
	
	
	@Test
	public void testGetNbPlaces() {
		assertEquals(54, formule.getNbPlaces());
	}
	
	@Test
	public void testSetNbPlaces() {
		formule.setNbPlaces(98);
		assertEquals(98, formule.getNbPlaces());
	}
	
	@Test
	public void testGetPrix() {
		assertEquals(24.25, formule.getPrix(), 0.01); 
	}
	
	@Test
	public void testGetVoyage() {
		
		assertEquals(54, formule.getNbPlaces());
	}
	
	

}
