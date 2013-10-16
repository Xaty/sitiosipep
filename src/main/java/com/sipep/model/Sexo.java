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
	
	public static Sexo get(String value){
		Sexo result = null;
		if(value.equals("M")){
			result = Sexo.MASCULINO;
		}else if(value.equals("F")){
			result = Sexo.FEMENINO;
			
		}
		return result;
	}
}
