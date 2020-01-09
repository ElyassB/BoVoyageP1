package fr.gtm.boVoyage.metier;

import static org.junit.Assert.*;

import org.junit.Test;

public class DestinationTest {
	
Destination destination = new Destination("Bagdad", "il fait chaud");


	@Test
	public void testGetId() {
		assertNotNull(destination.getId());
	}
	
	@Test
	public void testGetImage() {
		assertNotNull(destination.getImages());
	}
	
	@Test
	public void testGetNom() {
		
		assertEquals("Bagdad", destination.getNom());
	}
	
	@Test
	public void testGetDescription() {
		
		assertEquals("il fait chaud", destination.getDescription());
	}
	
	
	@Test
	public void testSetNom() {
		destination.setNom("Le Caire");
		assertEquals("Le Caire", destination.getNom());
	}
	
	
	@Test
	public void testSetDescription() {
		destination.setDescription("il fait plus chaud finalement");
		assertEquals("il fait plus chaud finalement", destination.getDescription());
	}
	
	
	
	
	
	
	
	

}
