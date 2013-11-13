package com.sipep.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sipep.model.Empresa;

public class TestEmpresaDao {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private EmpresaDao empresaDao;
	
	@Test
	public void testCreateEmpresa(){
		
		Empresa em = new Empresa("1", "telcel", "calle nuevo mexico No.3",
				"telefonia", "macro", "telcel@telcel.com");
		
		empresaDao.create(em);
		
		Empresa read = empresaDao.read(em.getIdEmpresa());
		
		Assert.assertNotNull(read);
		
		Assert.assertTrue(read.getIdEmpresa().equals("1"));
		Assert.assertTrue(read.getNombre().equals("telcel"));
		Assert.assertTrue(read.getDireccion().equals("calle nuevo mexico No.3"));
		Assert.assertTrue(read.getGiro().equals("telefonia"));
		Assert.assertTrue(read.getClasificacion().equals("macro"));
		Assert.assertTrue(read.getEmail().equals("telcel@telcel.com"));
	}

}
