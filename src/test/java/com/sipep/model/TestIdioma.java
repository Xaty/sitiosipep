package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;

public class TestIdioma {
	@Test
	
	public void casoPrueba7(){
		
		Idioma i = new Idioma("Ingles", "B1");
		
		Assert.assertNotNull(i);
		
		Assert.assertTrue(i.getIdioma().equals("Ingles"));
		Assert.assertTrue(i.getNivel().equals("B1"));
	}

}
