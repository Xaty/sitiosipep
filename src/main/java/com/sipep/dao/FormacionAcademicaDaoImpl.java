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

import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.FormacionAcademica;
import com.sipep.model.Sexo;

@Repository
public class FormacionAcademicaDaoImpl extends JdbcTemplate implements FormacionAcademicaDao{

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		super.setDataSource(dataSource);
	}
	
	@Override
	public void create(FormacionAcademica newInstance) {
		this.update(
				"INSERT INTO " +
				"formacion_academica(id_formacion, nombre_institucion, carrera, especialidad) " +
				"VALUES(?, ?, ?, ?, ?)",
				new Object[] {
						newInstance.getIdFormacionAcademica(),
						newInstance.getNombreInstitucion(),
						newInstance.getCarrera(),
						newInstance.getEspecialidad()
				});
	}

	@Override
	public FormacionAcademica read(String id) {
		String sql = "select * from formacion_academica where id_formacion = ?";
		try {
			FormacionAcademica resultado = this.queryForObject(sql,
					new Object[] { id },
					new RowMapper<FormacionAcademica>() {
						@Override
						public FormacionAcademica mapRow(ResultSet rs, int rowNum) throws SQLException {
							FormacionAcademica formAcademica = new FormacionAcademica(
									rs.getString("id_formacion"), 
									rs.getString("nombre_institucion"),
									rs.getString("carrera"),
									rs.getString("especialidad")
									);							
							return formAcademica;
						}
					});
			return resultado;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}
		
		
		
	}

	@Override
	public void update(FormacionAcademica transientObject) {
		this.update(
				"UPDATE formacion_academica " +
				"SET nombre_institucion = ? " +
				"WHERE id_formacion_academica = ?",
				new Object[] {
						transientObject.getIdFormacionAcademica(),
						transientObject.getNombreInstitucion(),
						transientObject.getEspecialidad(),
						transientObject.getCarrera()
				}
			);
		
	}

	@Override
	public void delete(FormacionAcademica persistentObject) {
		this.update(
				"DELETE FROM formacion_academica " +
				"WHERE id_formacion = ?",
				new Object[] {
						persistentObject.getIdFormacionAcademica()
				}
			);
	}

	@Override
	public List<FormacionAcademica> findAll() {
		String sql = "SELECT * FROM egresado";
		List<FormacionAcademica> result = this.query(sql, new RowMapper<FormacionAcademica>() {
			@Override
			public FormacionAcademica mapRow(ResultSet rs, int rowNum) throws SQLException {
				FormacionAcademica formacion = new FormacionAcademica(
						rs.getString("id_formacion"), 
						rs.getString("nombre_institucion"),
						rs.getString("carrera"),
						rs.getString("especialidad")
						);
				return formacion;
			}
		});
		return result;
	}

	@Override
	public List<FormacionAcademica> findAllByCarrera(String carrera) {
		// TODO Auto-generated method stub
		return null;
	}

}
