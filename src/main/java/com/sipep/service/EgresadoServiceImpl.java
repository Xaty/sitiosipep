package com.sipep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sipep.dao.EgresadoDao;
import com.sipep.model.Egresado;
@Service
public class EgresadoServiceImpl implements EgresadoService{

	@Autowired
	private EgresadoDao dao;
	
	@Override
	public void registrarEgresado(Egresado egresado) {
		// verficar si existe egresado
		dao.create(egresado); // se encarga de guardar en la tabla
	}

}
