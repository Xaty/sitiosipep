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
import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.Sexo;

@Repository
public class CurriculumVitaeDoaImpl extends JdbcTemplate implements CurriculumVitaeDao{
	
	@Autowired
	@Override
	public void setDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}

	@Override
	public void create(CurriculumVitae newInstance) {
		this.update(
		"INSERT INTO " +
				"curriculum(id_curriculum, habilidades, id_egresado) " +
				"VALUES(?, ?, ?)",
				new Object[] {
						newInstance.getIdCurriculum(),
						newInstance.getHabilidades(),
						newInstance.getIdEgresado()
				});
		
	}

	@Override
	public CurriculumVitae read(String id) {
		String sql = "select * from curriculum where id_curriculum = ?";
		try {
			CurriculumVitae resultado = this.queryForObject(sql,
					new Object[] { id }, new RowMapper<CurriculumVitae>() {
						@Override
						public CurriculumVitae mapRow(ResultSet rs, int rowNum)
								throws SQLException {
							CurriculumVitae curriculum = new CurriculumVitae(
									rs.getString("id_curriculum"), 
									null									
									);
								return curriculum;
						}
					});
			return resultado;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}
	}
	@Override
	public void update(CurriculumVitae transientObject) {
		this.update(
				"UPDATE curriculum " +
				"SET habilidades = ? " +
				"WHERE id_curriculum = ?",
				new Object[] {
						transientObject.getIdCurriculum(),
						transientObject.getHabilidades(),
						transientObject.getIdEgresado()
				}
			);
	}

	@Override
	public void delete(CurriculumVitae persistentObject) {
		this.update(
				"DELETE * FROM curriculum " +
				"WHERE id_curriculum = ?",
				new Object[] {
						persistentObject.getIdCurriculum()
				}
			);
	}

	@Override
	public List<CurriculumVitae> findAll() {
		String sql = "SELECT * FROM curriculum";
		List<CurriculumVitae> result = this.query(sql, new RowMapper<CurriculumVitae>() {
			@Override
			public CurriculumVitae mapRow(ResultSet rs, int rowNum) throws SQLException {
				CurriculumVitae curriculum = /*new CurriculumVitae(
						rs.getString("id_curriculum"), 
						rs.getString("habilidades"),
						Egresado.
						);*/ null;
				return curriculum;
			}
		});
		return result;
	}

}
