package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;

public class TestCurriculumVitae {
	@Test
	public void caso1() {
		
		Egresado egr = new Egresado("1", "juan", "perez", "perez",
				"gaga0sga87g7asf", "jpp@hotmail.com", Sexo.MASCULINO,
				Estatus.ACTIVO);
		
		CurriculumVitae c = new CurriculumVitae("1", egr);
		
		

		Curso c1 = new Curso("1","Android", "UTVM", "Del 27 al 10 de Diciembre", c);
		c.getCursos().add(c1);

		Assert.assertTrue(c.getCursos().size() > 0);

		FormacionAcademica f = new FormacionAcademica("1", "UTVM", "TIC",
				"Telecomunicaciones");

		c.getFormacionesAcademicas().add(f);

		Assert.assertTrue(c.getFormacionesAcademicas().size() > 0);

		Experiencia e = new Experiencia("1", "PROTECSA", "Av. 5 de febrero No.1220",
				"Desarrollador", "1 año", "programar",
				" proyectos terminados", c);
		
		
		c.getExperiencias().add(e);
		
		Assert.assertTrue(c.getExperiencias().size() > 0);
		
		Idioma i = new Idioma("1", "frances", "B2");
		
		c.getIdiomas().add(i);
		
		Assert.assertTrue(c.getIdiomas().size() > 0);

	}
}
