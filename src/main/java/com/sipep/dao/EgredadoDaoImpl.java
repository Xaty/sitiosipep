package com.sipep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.sql.DataSource;

import org.hibernate.validator.util.privilegedactions.NewInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.Sexo;
@Repository
public class EgredadoDaoImpl extends JdbcTemplate implements EgresadoDao{

	
	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	@Override
	public void create(Egresado newInstance) {
		this.update(
				"INSERT INTO " +
				"egresado(id_egresado, nombre, apellido_paterno, apellido_materno, curp, correo, sexo, estatus) " +
				"VALUES(?, ?, ?, ?, ?, ?, ?, ?)",
				new Object[] {
						newInstance.getIdEgresado(),
						newInstance.getNombre(),
						newInstance.getApellidoPaterno(),
						newInstance.getApellidoMaterno(),
						newInstance.getCurp(),
						newInstance.getCorreo(),
						newInstance.getSexo().getIdSexo(),
						newInstance.getEstatus().getIdEstatus()
				});
		
	}

	@Override
	public Egresado read(String id) {
		String sql = "select * from egresado where id_egresado = ?";
		try {
			Egresado resultado = this.queryForObject(sql,
					new Object[] { id },
					new RowMapper<Egresado>() {
						@Override
						public Egresado mapRow(ResultSet rs, int rowNum) throws SQLException {
							Egresado egresado= new Egresado(
									rs.getString("id_egresado"), 
									rs.getString("nombre"),
									rs.getString("apellido_paterno"),
									rs.getString("apellido_materno"),
									rs.getString("curp"),
									rs.getString("correo"),
									Sexo.get(rs.getString("sexo")),
									Estatus.get(rs.getInt("estatus"))
									);							
							return egresado;
						}
					});
			return resultado;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}
	}

	@Override
	public void update(Egresado transientObject) {
		this.update(
				"UPDATE egresado " +
				"SET descripcion = ? " +
				"WHERE id_egresado = ?",
				new Object[] {
						transientObject.getNombre(),
						transientObject.getApellidoPaterno(),
						transientObject.getApellidoMaterno()
				}
			);
		
	}

	@Override
	public void delete(Egresado persistentObject) {
		this.update(
				"DELETE FROM egresado " +
				"WHERE id_egresado = ?",
				new Object[] {
						persistentObject.getIdEgresado()
				}
			);
		
	}

	@Override
	public List<Egresado> findAll() {
		String sql = "SELECT * FROM egresado";
		List<Egresado> result = this.query(sql, new RowMapper<Egresado>() {
			@Override
			public Egresado mapRow(ResultSet rs, int rowNum) throws SQLException {
				Egresado egresado= new Egresado(
						rs.getString("idEgresado"), 
						rs.getString("nombre"),
						rs.getString("apellidoPaterno"),
						rs.getString("apellidoMaterno"),
						rs.getString("curp"),
						rs.getString("correo"),
						Sexo.get(rs.getString("sexo")),
						Estatus.get(rs.getInt("estatus"))
						);
				return egresado;
			}
		});
		return result;
	}

	@Override
	public List<Egresado> findAllByEstatus(Estatus estatus) {
		return null;
	}

}
