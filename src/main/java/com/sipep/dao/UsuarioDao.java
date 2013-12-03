package com.sipep.dao;

import java.util.List;

import com.sipep.model.Usuario;

public interface UsuarioDao extends Dao<Usuario, String>{
	List<Usuario> FindAllByIdUsuario(Usuario idUsuario);
}
