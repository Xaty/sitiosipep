package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;

public class TestCurriculumVitae {
	@Test
	public void caso1() {
		CurriculumVitae c = new CurriculumVitae();

		Curso c1 = new Curso("Android", "UTVM", "Del 27 al 10 de Diciembre");
		c.getCursos().add(c1);

		Assert.assertTrue(c.getCursos().size() > 0);

		FormacionAcademica f = new FormacionAcademica("UTVM", "TIC",
				"Telecomunicaciones");

		c.getFormacionesAcademicas().add(f);

		Assert.assertTrue(c.getFormacionesAcademicas().size() > 0);

		Experiencia e = new Experiencia("protecsa", "5 de febrero 1020",
				"desarrollador", "8 meses", "programar",
				"2 proyectos terminados");
		
		c.getExperiencias().add(e);
		
		Assert.assertTrue(c.getExperiencias().size() > 0);
		
		Idioma i = new Idioma("frances", "B2");
		
		c.getIdiomas().add(i);
		
		Assert.assertTrue(c.getIdiomas().size() > 0);

	}
}
