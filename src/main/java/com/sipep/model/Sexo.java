package com.sipep.model;

public enum Sexo {
	MASCULINO("M", "Masculino"), FEMENINO("F", "Femenino");

	private String idSexo;
	private String descripcion;

	private Sexo(String idSexo, String descripcion) {
		this.idSexo = idSexo;
		this.descripcion = descripcion;
	}

	public String getIdSexo() {
		return idSexo;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
