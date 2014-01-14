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

import com.sipep.model.Curso;


@Repository
public class CursoDaoImpl extends JdbcTemplate implements CursoDao{

	
	@Autowired
	@Override
	public void setDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}
	
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
		String sql = "select * from curso where id_curso = ?";
		try {
			Curso resultado = this.queryForObject(sql,
					new Object[] { id },
					new RowMapper<Curso>() {
						@Override
						public Curso mapRow(ResultSet rs, int rowNum) throws SQLException {
							// TODO: Terminar este pedo
							Curso c = new Curso(
									rs.getString("id_curso"),
									rs.getString("nombre_capacitacion"),
									rs.getString("institucion"),
									rs.getString("periodo_curso"),
									null // TODO: Antes hacer el dao de CV
									);
							return c;
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
		this.update(
				"UPDATE curso " +
				"SET nombre_capacitacion = ? , institucion = ?, periodo_curso = ?" +
				"WHERE id_egresado = ?",
				new Object[] {
						transientObject.getNombreCapacitacion(),
						transientObject.getInstitucion(),
						transientObject.getPeriodoDelCurso(),
						transientObject.getCurriculumVitae()
				}
			);
		
	}

	@Override
	public void delete(Curso persistentObject) {
		// TODO Auto-generated method stub
		this.update(
				"DELETE FROM curso " +
				"WHERE id_curso = ?",
				new Object[] {
						persistentObject.getIdCapacitacion()
				}
			);
	}

	@Override
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}	

}
