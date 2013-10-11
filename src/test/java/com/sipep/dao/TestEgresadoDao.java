package com.sipep.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.sipep.model.Egresado;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/AppCtx-Spring-Test.xml")
@Transactional
public class TestEgresadoDao {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private EgresadoDao egresadoDao;
	
	@Test
	public void testCreateEgreado(){
		log.debug("Probando probando..");
		Egresado egr = null;
		egresadoDao.create(egr);
	}
}
