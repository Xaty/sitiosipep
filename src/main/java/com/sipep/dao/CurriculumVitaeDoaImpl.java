package com.sipep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sipep.model.CurriculumVitae;

@Repository
public class CurriculumVitaeDoaImpl extends JdbcTemplate implements CurriculumVitaeDao{
	
	@Autowired
	@Override
	public void setDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}

	@Override
	public void create(CurriculumVitae newInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CurriculumVitae read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CurriculumVitae transientObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CurriculumVitae persistentObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CurriculumVitae> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
