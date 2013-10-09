package com.sipep.model;

public enum Rol {
	EGRESADO(1, "Egresado"), ADMINISTRADOR(2, "Administrador");

	private int idRole;
	private String descripcion;

	private Rol(int idRole, String descripcion) {
		this.idRole = idRole;
		this.descripcion = descripcion;
	}

	public int getIdRole() {
		return idRole;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
