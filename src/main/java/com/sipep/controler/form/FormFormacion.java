package com.sipep.controler.form;

import org.hibernate.validator.constraints.NotBlank;

public class FormFormacion {
	
	@NotBlank
	private String nombre;
	@NotBlank
	private String nombrePrograma;
	@NotBlank
	private String especialidad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombrePrograma() {
		return nombrePrograma;
	}
	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
