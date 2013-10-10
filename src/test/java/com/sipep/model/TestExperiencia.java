package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;

public class TestExperiencia {
	@Test
	public void casoPrueba5() {
		Experiencia ex = new Experiencia("PROTECSA",
				"Av. 5 de febrero No.1220", "Desarrollador", "1 año",
				"programar", "3 proyectos finalizados");
		
		Assert.assertNotNull(ex);
		
		Assert.assertTrue(ex.getNombreEmpresa().equals("PROTECSA"));
		Assert.assertTrue(ex.getDireccion().equals("Av. 5 de febrero No.1220"));
		Assert.assertTrue(ex.getPuesto().equals("Desarrollador"));
		Assert.assertTrue(ex.getDuracion().equals("1 año"));
		Assert.assertTrue(ex.getFunciones().equals("programar"));
		Assert.assertTrue(ex.getLogros().equals("3 proyectos finalizados"));
		
	}

}
