package com.sipep.dao;

import java.util.List;

import com.sipep.model.Egresado;
import com.sipep.model.Estatus;

public interface EgresadoDao extends Dao<Egresado, Integer>{
	List<Egresado> findAllByEstatus(Estatus estatus); 
}
