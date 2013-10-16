package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;

public class TestIdioma {
	@Test
	
	public void casoPrueba7(){
		
		Idioma i = new Idioma("1","Ingles", "B1");
		
		Assert.assertNotNull(i);
		
		Assert.assertTrue(i.getIdIdioma().equals("1"));
		Assert.assertTrue(i.getIdioma().equals("Ingles"));
		Assert.assertTrue(i.getNivel().equals("B1"));
	}

}
