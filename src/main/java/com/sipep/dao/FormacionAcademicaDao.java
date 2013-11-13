package com.sipep.dao;

import java.util.List;

import com.sipep.model.FormacionAcademica;

public interface FormacionAcademicaDao extends Dao<FormacionAcademica, String>{
	List<FormacionAcademica> findAllByCarrera(String carrera);
}
