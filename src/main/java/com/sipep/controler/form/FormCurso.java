package com.sipep.controler.form;

import org.hibernate.validator.constraints.NotBlank;

public class FormCurso {
	@NotBlank
	private String capacitacion;
	@NotBlank
	private String institucion;
	@NotBlank
	private String periodo;
	
	
	public String getCapacitacion() {
		return capacitacion;
	}
	public void setCapacitacion(String capacitacion) {
		this.capacitacion = capacitacion;
	}
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	

}
