package com.sipep.dao;

import junit.framework.Assert;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sipep.model.CurriculumVitae;
import com.sipep.model.Curso;
import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.Sexo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("AppCtx-Spring_Test.xml")

public class TestCursoDao {
	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private CursoDao cursoDao;
	
	@Test
	public void testCreateCurso(){
		
		Egresado eg = new Egresado("1", "juan", "perez", "perez",
				"gaga0sga87g7asf", "jpp@hotmail.com", Sexo.MASCULINO,
				Estatus.ACTIVO);
		CurriculumVitae cv = new CurriculumVitae("1", eg);
		
		Curso c = new Curso("1", "java", "UTVM", "Mayo-Agosto 2013", cv);
		
		cursoDao.create(c);
		
		Curso read = cursoDao.read(c.getIdCapacitacion());
		
		Assert.assertNotNull(read);
		
		Assert.assertTrue(read.getIdCapacitacion().equals("1"));
		Assert.assertTrue(read.getNombreCapacitacion().equals("java"));
		Assert.assertTrue(read.getInstitucion().equals("Mayo-Agosto 2013"));
		Assert.assertTrue(read.getCurriculumVitae().equals(cv));
		
	}

}
