package com.sipep.model;
/*
 * autor: manu
 * modifcado por: mracapri
 * */
public class FormacionAcademica {
	
	public String nombreInstitucion;
	public String carrera;
	public String especialidad;
	
	public FormacionAcademica(String nombreIntitucion, String carrera, String especialidad){
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
	
	

}
