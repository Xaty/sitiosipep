package com.sipep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.nativejdbc.Jdbc4NativeJdbcExtractor;
import org.springframework.stereotype.Repository;

import com.sipep.model.CurriculumVitae;
import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.Rol;
import com.sipep.model.Sexo;
import com.sipep.model.Usuario;

@Repository
public class UsuarioDaoImpl extends JdbcTemplate implements UsuarioDao{

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}
	
	@Override
	public void create(Usuario newInstance) {
		this.update(
				"INSERT INTO " +
						"usuario(id_usuario, usuario, clave, rol) " +
						"VALUES(?, ?, ?, ?)",
						new Object[] {
								newInstance.getId(),
								newInstance.getUsuario(),
								newInstance.getClave(),
								newInstance.getRol().getIdRole()
						});
	}

	@Override
	public Usuario read(String id) {
		String sql = "select * from usuario where id_usuario = ?";
		try {
			Usuario result = this.queryForObject(sql,
					new Object[] { id }, new RowMapper<Usuario>() {
						@Override
						public Usuario mapRow(ResultSet rs, int rowNum)
								throws SQLException {
							Usuario usuario = new Usuario(
									rs.getString("id_usuario"), 
									rs.getString("usuario"),
									rs.getString("clave"),
									null
									);
								return usuario;
						}
					});
			return result;
		} catch (EmptyResultDataAccessException accessException) {
			return null;
		}
	}

	@Override
	public void update(Usuario transientObject) {
		this.update(
				"UPDATE usuario " +
				"SET clave = ? " +
				"WHERE id_usuario = ?",
				new Object[] {
						transientObject.getId(),
						transientObject.getUsuario(),
						transientObject.getClave(),
						transientObject.getRol()
				}
			);
		
	}

	@Override
	public void delete(Usuario persistentObject) {
		this.update(
				"DELETE FROM usuario " +
				"WHERE id_usuario = ?",
				new Object[] {
						persistentObject.getId()
				}
			);	
	}

	@Override
	public List<Usuario> findAll() {
		String sql = "SELECT * FROM usuario";
		List<Usuario> result = this.query(sql, new RowMapper<Usuario>() {
			@Override
			public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
				Usuario usuario = new Usuario(
						rs.getString("id"), 
						rs.getString("usuario"),
						rs.getString("clave"),
						null
						);
				return usuario;
			}
		});
		return result;
	}

	@Override
	public List<Usuario> FindAllByIdUsuario(Usuario idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
