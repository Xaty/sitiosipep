package com.sipep.controler.form;

import org.hibernate.validator.constraints.NotBlank;

public class FormExperiencia {
	
	@NotBlank
	private String nombre;
	@NotBlank
	private String periodo;
	@NotBlank
	private String direccion;
	@NotBlank
	private String puesto;
	@NotBlank
	private String funciones;
	@NotBlank
	private String logros;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getFunciones() {
		return funciones;
	}
	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}
	public String getLogros() {
		return logros;
	}
	public void setLogros(String logros) {
		this.logros = logros;
	}
	

}
