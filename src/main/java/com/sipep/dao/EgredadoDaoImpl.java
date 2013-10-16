package com.sipep.dao;

import java.sql.SQLException;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.sql.DataSource;

import org.hibernate.validator.util.privilegedactions.NewInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.ResultSet;
import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
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
				"egresado(nombre, apellidoPaterno, ApellidoMaterno, curp, correo, sexo, estatus)" +
				"VALUES(?,?)",
				new Object[] {
						newInstance.getNombre(),
						newInstance.getApellidoPaterno(),
						newInstance.getApellidoMaterno(),
						newInstance.getCurp(),
						newInstance.getCorreo(),
						newInstance.getSexo(),
						newInstance.getEstatus()
				});
		
	}

	@Override
	public Egresado read(Integer id) {
		String sql = "select * from egresado where id_egresado = ?";
		try {
			Egresado resultado = this.queryForObject(sql,
					new Object[] { id },
					new RowMapper<Egresado>() {
						@Override
						public Egresado mapRow(ResultSet rs, int rowNum) throws SQLException {
							Egresado egresado= new Egresado(rs.getInt("id_egresado"), rs.getString("descripcion"));							
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
				Egresado e = new Egresado(rs.getInt("id_egresado"));
				return e;
			}
		});
		return result;
	}

	@Override
	public List<Egresado> findAllByEstatus(Estatus estatus) {
		//String sql = "SELECT e.estatus FROM egresado e, estatus es where e.id_estatus = es.id_estatus";
		//List<Egresado> result = this.query(sql, new RowMapper<Egresado>(){
		//	@Override
		//	public Egresado mapRow(ResultSet rs, int rowNum) throws SQLException{
		//		Egresado e = new Egresado(rs.getInt("idEstatus"));
		//		return e;
		//	}
		//});
	}

}
