package com.sipep.model;
/*
 * autor: manu
 * modifcado por: mracapri
 * */
public class FormacionAcademica {
	
	public String idFormacionAcademica;
	public String nombreInstitucion;
	public String carrera;
	public String especialidad;
	
	public FormacionAcademica(String idFormacionAcademica, String nombreIntitucion, String carrera, String especialidad){
		this.idFormacionAcademica = idFormacionAcademica;
		this.nombreInstitucion = nombreIntitucion;
		this.carrera = carrera;
		this.especialidad = especialidad;
		
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public String getCarrera() {
		return carrera;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public String getIdFormacionAcademica() {
		return idFormacionAcademica;
	}
	
}
