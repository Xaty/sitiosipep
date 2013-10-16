package com.sipep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sipep.model.Curso;
import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.Sexo;

@Repository
public class CursoDaoImpl extends JdbcTemplate implements CursoDao{

	@Override
	public void create(Curso newInstance) {
		this.update(
				"INSERT INTO " +
				"curso(id_curso, nombre_capacitacion, institucion, periodo_curso) " +
				"VALUES(?, ?, ?, ?, ?)",
				new Object[] {
						newInstance.getIdCapacitacion(),
						newInstance.getNombreCapacitacion(),
						newInstance.getInstitucion(),
						newInstance.getPeriodoDelCurso(),
						newInstance.getCurriculumVitae()
				});
		
	}

	@Override
	public Curso read(String id) {
		String sql = "select * from curso where id_egresado = ?";
		try {
			Curso resultado = this.queryForObject(sql,
					new Object[] { id },
					new RowMapper<Curso>() {
						@Override
						public Curso mapRow(ResultSet rs, int rowNum) throws SQLException {
							// TODO: Terminar este pedo
							return null;
						}
					});
			return resultado;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}

	}

	@Override
	public void update(Curso transientObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Curso persistentObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}	

}
