package com.sipep.model;

import junit.framework.Assert;

import org.junit.Test;

public class TestEgresado {
	@Test
	public void casoPrueba1(){
		
		Egresado e = new Egresado("Mario", "Rivera", "Angeles", "QWEQWEASD",
				"mra_capri@msn.com", Sexo.MASCULINO, Estatus.ACTIVO);
				
		Assert.assertNotNull(e);
				
		Assert.assertTrue(e.getNombre().equals("Mario"));
		Assert.assertTrue(e.getApellidoPaterno().equals("Rivera"));
		Assert.assertTrue(e.getApellidoMaterno().equals("Angeles"));
		Assert.assertTrue(e.getCurp().equals("QWEQWEASD"));
		Assert.assertTrue(e.getCorreo().equals("mra_capri@msn.com"));
		Assert.assertTrue(e.getSexo().getIdSexo() == Sexo.MASCULINO.getIdSexo());
		Assert.assertTrue(e.getEstatus().getIdEstatus() == Estatus.ACTIVO.getIdEstatus());
	}
}
