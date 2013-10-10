package com.sipep.model;
/*
 * autor: manu
 * modifcado por: mracapri
 * */
public class Curso {

	public String nombreCapacitacion;
	public String institucion;
	public String periodoDelCurso;
	
	public Curso(String nombreCapacitacion, String institucion, String periodoDelCurso){
		this.nombreCapacitacion = nombreCapacitacion;
		this.institucion = institucion;
		this.periodoDelCurso = periodoDelCurso;
	}

	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}

	public String getInstitucion() {
		return institucion;
	}

	public String getPeriodoDelCurso() {
		return periodoDelCurso;
	}
	
	

}
