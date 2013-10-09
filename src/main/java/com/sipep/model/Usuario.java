package com.sipep.model;

public class Usuario {
	
	private String usuario;
	private String clave;
	private Rol rol;

	/*
	 * Atributos necesarios del usuario
	 * */
	public Usuario(String usuario, String clave, Rol rol) {
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
