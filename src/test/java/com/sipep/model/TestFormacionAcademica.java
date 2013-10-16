package com.sipep.model;

import org.junit.Assert;
import org.junit.Test;

public class TestFormacionAcademica {
	
	@Test
	
	public void casoPrueba6(){
		FormacionAcademica fm = new FormacionAcademica("1", "UTVM", "TIC", "Sistemas Informaticos");
		
		Assert.assertNotNull(fm);
		
		Assert.assertTrue(fm.getIdFormacionAcademica().equals("1"));
		Assert.assertTrue(fm.getNombreInstitucion().equals("UTVM"));
		Assert.assertTrue(fm.getCarrera().equals("TIC"));
		Assert.assertTrue(fm.getEspecialidad().equals("Sistemas Informaticos"));
		
	}

}
