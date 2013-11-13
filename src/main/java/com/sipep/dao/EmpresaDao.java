package com.sipep.dao;

import java.util.List;

import com.sipep.model.Empresa;

public interface EmpresaDao extends Dao<Empresa, String> {
	List<Empresa> findAllByGiro(Empresa empresa);

}
