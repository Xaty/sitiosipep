package com.sipep.model;

public class Usuario {
	
	private String id;
	private String usuario;
	private String clave;
	private Rol rol;

	/*
	 * Atributos necesarios del usuario
	 * */
	public Usuario(String id, String usuario, String clave, Rol rol) {
		this.id = id;
		this.usuario = usuario;
		this.clave = clave;
		this.rol = rol;
	}
	
	public void crearCuenta(){}
	public void iniciarSesion(){}
	public void cerrarSesion(){}

	public String getUsuario() {
		return usuario;
	}

	public String getClave() {
		return clave;
	}

	public Rol getRol() {
		return rol;
	}

}
