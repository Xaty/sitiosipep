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
		String sql = "select * from egresado where id_egresado = ?";
		try {
			Experiencia resultado = this.queryForObject(sql,
					new Object[] { id },
					new RowMapper<Experiencia>() {
						@Override
						public Experiencia mapRow(ResultSet rs, int rowNum) throws SQLException {
									return null;

						}
					});
			return resultado;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}
	}

	@Override
	public void update(Experiencia transientObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Experiencia persistentObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Experiencia> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experiencia> findAllByPuesto(String puesto) {
		// TODO Auto-generated method stub
		return null;
	}
}
