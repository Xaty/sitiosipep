package com.sipep.dao;

import java.util.List;

import com.sipep.model.Egresado;
import com.sipep.model.Idioma;

public interface IdiomaDao extends Dao<Idioma, String>{
	List<Idioma> findAllByIdioma(Egresado egresado);
}
