package com.sipep.model;

import junit.framework.Assert;

import org.junit.Test;

public class TestCurso {
	@Test
	
	public void casoPrueba4(){
		
		Egresado eg = new Egresado("1", "juan", "perez", "perez",
				"gaga0sga87g7asf", "jpp@hotmail.com", Sexo.MASCULINO,
				Estatus.ACTIVO);
		
		CurriculumVitae cur = new CurriculumVitae("1", eg);
		
		
		Curso c = new Curso("1","Desarrollo Web", "UTVM", "Mayo-Agosto 2012", cur);
		
		Assert.assertTrue(c.getIdCapacitacion().equals("1"));
		Assert.assertTrue(c.getNombreCapacitacion().equals("Desarrollo Web"));
		Assert.assertTrue(c.getInstitucion().equals("UTVM"));
		Assert.assertTrue(c.getPeriodoDelCurso().equals("Mayo-Agosto 2012"));
	}

}
