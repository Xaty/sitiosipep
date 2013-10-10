package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;

public class TestUsuario {
	@Test
	
	public void casoPrueba9(){
		Usuario u = new Usuario("josep", "103555", Rol.EGRESADO);
		
		Assert.assertNotNull(u);
		
		Assert.assertTrue(u.getUsuario().equals("josep"));
		Assert.assertTrue(u.getClave().equals("103555"));
		Assert.assertTrue(u.getRol().getIdRole() == Rol.EGRESADO.getIdRole());
		
	}

}
