package com.sipep.dao;

import java.util.List;

import com.sipep.model.Experiencia;

public interface ExperienciaDao extends Dao<Experiencia, String>{
	List<Experiencia> findAllByPuesto(String puesto);
}
