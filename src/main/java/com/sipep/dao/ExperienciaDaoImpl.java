package com.sipep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sipep.model.CurriculumVitae;
import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.Experiencia;
import com.sipep.model.Sexo;


@Repository
public class ExperienciaDaoImpl extends JdbcTemplate implements ExperienciaDao{

	@Override
	public void create(Experiencia newInstance) {
		this.update(
				"INSERT INTO " +
				"experiencia(id_experiencia, nombre_Empresa, direccion, puesto, duracion, funciones, logros, id_curriculum) " +
				"VALUES(?, ?, ?, ?, ?, ?, ?, ?)",
				new Object[] {
						newInstance.getIdExperiencia(),
						newInstance.getNombreEmpresa(),
						newInstance.getDireccion(),
						newInstance.getPuesto(),
						newInstance.getDuracion(),
						newInstance.getFunciones(),
						newInstance.getLogros(),
						newInstance.getCurriculumVitae()
				});
		
	}

	@Override
	public Experiencia read(String id) {
		String sql = "select * from experiencia where id_experiencia = ?";
		try {
			Experiencia resultado = this.queryForObject(sql,
					new Object[] { id },
					new RowMapper<Experiencia>() {
						@Override
						public Experiencia mapRow(ResultSet rs, int rowNum) throws SQLException {
							Experiencia experiencia = new Experiencia(
									rs.getString("id_experiencia"),
									rs.getString("nombre_Empresa"), 
									rs.getString("direccion"),
									rs.getString("puesto"),
									rs.getString("duracion"),
									rs.getString("funciones"),
									rs.getString("logros"),
									null // TODO: Primero hacer el de CV y luego explicar
									);
									return experiencia;
						}
					});
			return resultado;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}
	}

	@Override
	public void update(Experiencia transientObject) {
		this.update(
				"UPDATE experiencia= ?" +
				"SET logros= ?" + 
				"WHERE id_experiencia",
				new Object[]{
						transientObject.getNombreEmpresa(),
						transientObject.getLogros()
				}	
			);
	}

	@Override
	public void delete(Experiencia persistentObject) {
		this.update(
				"DELETE FROM experiencia " +
				"WHERE id_experiencia = ?",
				new Object[] {
						persistentObject.getIdExperiencia()
				}
			);
		
	}

	@Override
	public List<Experiencia> findAll() {
		String sql = "SELECT * FROM egresado";
		List<Experiencia> result = this.query(sql, new RowMapper<Experiencia>() {
			@Override
			public Experiencia mapRow(ResultSet rs, int rowNum) throws SQLException {
				Experiencia experiencia = new Experiencia(
						rs.getString("idExperiencia"), 
						rs.getString("nombreEmpresa"),
						rs.getString("direccion"),
						rs.getString("puesto"),
						rs.getString("duracion"),
						rs.getString("funciones"),
						rs.getString("logros"),
						null
						);
				return experiencia;
			}
		});
		return result;

	}

	@Override
	public List<Experiencia> findAllByPuesto(String puesto) {
		// TODO Auto-generated method stub
		return null;
	}
}
