package com.sipep.model;
/*
 * autor: manu
 * modifcado por: mracapri
 * */
public class Curso {

	public String idCapacitacion;
	public String nombreCapacitacion;
	public String institucion;
	public String periodoDelCurso;
	
	public Curso(String idCapacitacion,String nombreCapacitacion, String institucion, String periodoDelCurso){
		this.idCapacitacion = idCapacitacion;
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

	public String getIdCapacitacion() {
		return idCapacitacion;
	}
	
	

}
