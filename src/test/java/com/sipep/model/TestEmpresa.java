package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;

public class TestEmpresa {
	@Test
	public void casoprueba3() {
		Empresa em = new Empresa("telcel", "calle nuevo mexico No.3",
				"telefonia", "macro", "telcel@telcel.com");
		
		Assert.assertNotNull(em);
		
		Assert.assertTrue(em.getNombre().equals("telcel"));
		Assert.assertTrue(em.getDireccion().equals("calle nuevo mexico No.3"));
		Assert.assertTrue(em.getGiro().equals("telefonia"));
		Assert.assertTrue(em.getClasificacion().equals("macro"));
		Assert.assertTrue(em.getEmail().equals("telcel@telcel.com"));

	}

}
