package com.sipep.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.Sexo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/AppCtx-Spring-Test.xml")
@Transactional
public class TestEgresadoDao {

	protected final Log log = LogFactory.getLog(this.getClass());

	@Autowired
	private EgresadoDao egresadoDao;

	@Test
	public void testCreateEgreado() {
		log.debug("Probando probando..");
		Egresado egr = new Egresado("1", "juan", "perez", "perez",
				"gaga0sga87g7asf", "jpp@hotmail.com", Sexo.MASCULINO,
				Estatus.ACTIVO);
		
		egresadoDao.create(egr);
		
		Egresado read = egresadoDao.read(egr.getIdEgresado());
		
		Assert.assertNotNull(read);
		
		Assert.assertTrue(read.getIdEgresado().equals("1"));
		Assert.assertTrue(read.getNombre().equals("juan"));
		Assert.assertTrue(read.getApellidoPaterno().equals("perez"));
		Assert.assertTrue(read.getApellidoMaterno().equals("perez"));
		Assert.assertTrue(read.getCurp().equals("gaga0sga87g7asf"));
		Assert.assertTrue(read.getCorreo().equals("jpp@hotmail.com"));
		Assert.assertTrue(read.getSexo().getIdSexo() == Sexo.MASCULINO.getIdSexo());
		Assert.assertTrue(read.getEstatus().getIdEstatus() == Estatus.ACTIVO.getIdEstatus());
	}
}
