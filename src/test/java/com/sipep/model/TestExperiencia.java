package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sipep.dao.EgresadoDao;
import com.sipep.dao.ExperienciaDao;

public class TestExperiencia {
	
	@Autowired
	ExperienciaDao dao;
	
	@Autowired
	EgresadoDao egresadoDao;
	
	@Test
	public void casoPrueba5() {
		Egresado e = new Egresado("123123", "Xaty", "Cardón", "Tepetate", 
				"werssdfrr", "xct@hotmail.com", 
				Sexo.FEMENINO, Estatus.ACTIVO, "err".getBytes());
		
		egresadoDao.create(e);
		
		CurriculumVitae cv = new CurriculumVitae("12", e);
		
		Experiencia ex = new Experiencia("1", "PROTECSA",
				"Av. 5 de febrero No.1220", "Desarrollador", "1 año",
				"programar", "3 proyectos finalizados", cv);
		

		Assert.assertNotNull(ex);
		
		Assert.assertTrue(ex.getIdExperiencia().equals("1"));
		Assert.assertTrue(ex.getNombreEmpresa().equals("PROTECSA"));
		Assert.assertTrue(ex.getDireccion().equals("Av. 5 de febrero No.1220"));
		Assert.assertTrue(ex.getPuesto().equals("Desarrollador"));
		Assert.assertTrue(ex.getDuracion().equals("1 año"));
		Assert.assertTrue(ex.getFunciones().equals("programar"));
		Assert.assertTrue(ex.getLogros().equals("3 proyectos finalizados"));
		Assert.assertTrue(ex.getCurriculumVitae().getIdCurriculum().equals("12"));
		
		dao.create(ex);
	}

}
