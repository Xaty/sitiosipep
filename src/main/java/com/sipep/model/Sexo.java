package com.sipep.model;

public enum Sexo {
	MASCULINO(1, "Masculino"), FEMENINO(2, "Femenino");

	private int idSexo;
	private String descripcion;

	private Sexo(int idSexo, String descripcion) {
		this.idSexo = idSexo;
		this.descripcion = descripcion;
	}

	public int getIdSexo() {
		return idSexo;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
