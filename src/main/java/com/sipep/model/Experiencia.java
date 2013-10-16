package com.sipep.model;

/*
 * autor: manu
 * modifcado por: mracapri
 * */
public class Experiencia {

	public String idExperiencia;
	public String nombreEmpresa;
	public String direccion;
	public String puesto;
	public String duracion;
	public String funciones;
	public String logros;
	public CurriculumVitae curriculumVitae;

	public Experiencia(String idExperiencia, String nombreEmpresa, String direccion, String puesto,
			String duracion, String funciones, String logros, CurriculumVitae curriculum) {
		
		this.idExperiencia = idExperiencia;
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = direccion;
		this.puesto = puesto;
		this.duracion = duracion;
		this.funciones = funciones;
		this.logros = logros;
		this.curriculumVitae = curriculum;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getPuesto() {
		return puesto;
	}

	public String getDuracion() {
		return duracion;
	}

	public String getFunciones() {
		return funciones;
	}

	public String getLogros() {
		return logros;
	}

	public String getIdExperiencia() {
		return idExperiencia;
	}

	public void setIdExperiencia(String idExperiencia) {
		this.idExperiencia = idExperiencia;
	}

	public CurriculumVitae getCurriculumVitae() {
		return curriculumVitae;
	}

}
