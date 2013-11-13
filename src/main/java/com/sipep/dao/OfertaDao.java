package com.sipep.dao;

import java.util.List;

import com.sipep.model.Oferta;

public interface OfertaDao extends Dao<Oferta, String>{
	List<Oferta> findAllByArea (Oferta oferta);

}
