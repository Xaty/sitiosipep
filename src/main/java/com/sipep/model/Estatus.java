package com.sipep.model;

public enum Estatus {
	ACTIVO(1, "Activo"), INACTIVO(2, "Inactivo");

	private int idEstatus;
	private String descripcion;

	private Estatus(int idEstatus, String descripcion) {
		this.idEstatus = idEstatus;
		this.descripcion = descripcion;
	}

	public int getIdEstatus() {
		return idEstatus;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public static Estatus get(int value){
		Estatus result = null;
		if(value == 1){
			result = Estatus.ACTIVO;
		}
		else if(value == 2){
			result = Estatus.INACTIVO;
		}
		return result;
	}
}
