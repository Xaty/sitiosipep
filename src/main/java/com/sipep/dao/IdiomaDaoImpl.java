package com.sipep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sipep.model.CurriculumVitae;
import com.sipep.model.Egresado;
import com.sipep.model.Idioma;

@Repository
public class IdiomaDaoImpl extends JdbcTemplate implements IdiomaDao{
	
	@Autowired
	@Override
	public void setDataSource(DataSource datasource){
		super.setDataSource(datasource);
	}

	@Override
	public void create(Idioma newInstance) {
		this.update(
				"INSERT INTO " +
				"idioma(id_idioma, idioma, nivel, id_curriculum) " +
				"VALUES(?, ?, ?, ?)",
				new Object[] {
					newInstance.getIdIdioma(),
					newInstance.getIdioma(),
					newInstance.getNivel()
				});
	}

	@Override
	public Idioma read(String id) {
		String sql = "select * from idioma where id_idioma = ?";
		try {
			Idioma resultado = this.queryForObject(sql,
					new Object[] { id }, new RowMapper<Idioma>() {
						@Override
						public Idioma mapRow(ResultSet rs, int rowNum)
								throws SQLException {
							Idioma idioma = new Idioma(
									rs.getString("id_idioma"), 
									rs.getString("idioma"),
									rs.getString("nivel")
									);
								return idioma;
						}
					});
			return resultado;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}
	}

	@Override
	public void update(Idioma transientObject) {
		this.update(
				"UPDATE idioma " +
				"SET idioma = ? " +
				"WHERE id_idioma = ?",
				new Object[] {
						transientObject.getIdIdioma(),
						transientObject.getIdioma(),
						transientObject.getNivel()
				}
			);
	}

	@Override
	public void delete(Idioma persistentObject) {
		this.update(
				"DELETE * FROM idioma " +
				"WHERE id_idioma = ?",
				new Object[] {
						persistentObject.getIdIdioma()
				}
			);
		
	}

	@Override
	public List<Idioma> findAll() {
		String sql = "SELECT * FROM idioma";
		List<Idioma> result = this.query(sql, new RowMapper<Idioma>() {
			@Override
			public Idioma mapRow(ResultSet rs, int rowNum) throws SQLException {
			Idioma idioma = new Idioma(
						rs.getString("idIdioma"), 
						rs.getString("idioma"),
						rs.getString("nivel")
						);
				return idioma;
			}
		});
		return result;
	}

	@Override
	public List<Idioma> findAllByIdioma(Egresado egresado) {
		// TODO Auto-generated method stub
		return null;
	}
}
