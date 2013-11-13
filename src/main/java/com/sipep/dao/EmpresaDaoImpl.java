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


import com.sipep.model.Empresa;

@Repository
public class EmpresaDaoImpl extends JdbcTemplate implements EmpresaDao {

	
	@Autowired
	@Override
	public void setDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}
	
	@Override
	public void create(Empresa newInstance) {
		// TODO Auto-generated method stub
		this.update(
				"INSERT INTO " +
				"empresa (id_empresa, nombre, giro, clasificacion, email, direccion, logotipo) " + 
				"VALUES(?, ?, ?, ?, ?, ?, ?)",
				new Object[]{
						newInstance.getIdEmpresa(),
						newInstance.getNombre(),
						newInstance.getGiro(),
						newInstance.getClasificacion(),
						newInstance.getEmail(),
						newInstance.getDireccion(),
						newInstance.getLogotipo()
				}
				);
		
	}

	@Override
	public Empresa read(String id) {
		// TODO Auto-generated method stub
		
		String sql = "select * from empresa where id_empresa = ?";
		try {
			Empresa resultado = this.queryForObject(sql,
					new Object[] { id },
					new RowMapper<Empresa>() {
						@Override
						public Empresa mapRow(ResultSet rs, int rowNum) throws SQLException {
							Empresa emp= new Empresa(
									rs.getString("id_empresa"),
									rs.getString("nombre"),
									rs.getString("giro"),
									rs.getString("clasificacion"),
									rs.getString("email"),
									rs.getString("direccion")
									);							
							return emp;
						}
					});
			return resultado;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}
	}

	@Override
	public void update(Empresa transientObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Empresa persistentObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empresa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> findAllByGiro(Empresa empresa) {
		// TODO Auto-generated method stub
		return null;
	}

}
