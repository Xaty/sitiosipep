package com.sipep.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sipep.model.Oferta;

@Repository
public class OfertaDaoImpl extends JdbcTemplate implements OfertaDao{

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}
	
	@Override
	public void create(Oferta newInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Oferta read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Oferta transientObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Oferta persistentObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Oferta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Oferta> findAllByArea(Oferta oferta) {
		// TODO Auto-generated method stub
		return null;
	}

}
