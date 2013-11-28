package com.sipep.controler.form;

import org.hibernate.validator.constraints.NotBlank;

public class FormOferta {
	
	@NotBlank
	private String nombreOferta;
	@NotBlank
	private String nombreEmpresa;
	@NotBlank
	private String informacion;
	@NotBlank
	private String requisitos;
	private String area;
	private int dia;
	private String mes;
	private int anio;
	
	public String getNombreOferta() {
		return nombreOferta;
	}
	public void setNombreOferta(String nombreOferta) {
		this.nombreOferta = nombreOferta;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getInformacion() {
		return informacion;
	}
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
}
