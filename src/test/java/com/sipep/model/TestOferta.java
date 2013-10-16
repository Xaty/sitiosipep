package com.sipep.model;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class TestOferta {
	@Test
	public void casoPrueba8() {
		Date fecha = new Date();
		Oferta o = new Oferta("1", "vacantes holliday inn", "hoteleria", fecha,
				"ninguna", "un año de experiencia", "holliday inn mexico");
		
		Assert.assertNotNull(o);
		
		Assert.assertTrue(o.getIdOferta().equals("1"));
		Assert.assertTrue(o.getNombre().equals("vacantes holliday inn"));
		Assert.assertTrue(o.getArea().equals("hoteleria"));
		Assert.assertTrue(o.getFecha().equals(fecha));
		Assert.assertTrue(o.getDescripcion().equals("ninguna"));
		Assert.assertTrue(o.getRequisitos().equals("un año de experiencia"));
		Assert.assertTrue(o.getEmpresa().equals("holliday inn mexico"));
	}

}
