package com.sipep.model;

import junit.framework.Assert;

import org.junit.Test;

public class TestAministrador {
	@Test
	
	public void casoPrueba2() {
		Administrador admin = new Administrador("admin@admin.com", "gabriela");
		
		Assert.assertNotNull(admin);
		
		Assert.assertTrue(admin.getNombre().equals("gabriela"));
		Assert.assertTrue(admin.getCorreo().equals("admin@admin.com"));

	}

}
