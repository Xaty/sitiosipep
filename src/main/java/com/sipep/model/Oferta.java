package com.sipep.model;

import java.util.Date;

public class Oferta {

	// TODO: Privar todos los atributos de las clases y definir los acceso por
	// get-set
	public String nombre;
	public String area;
	public Date fecha;
	public String descripcion;
	public String requisitos;
	public String empresa;

	// TODO: Definir constructor para valores minimos obligatorios
	public Oferta(String nombre, String area, Date fecha, String descripcion,
			String requisitos, String empresa) {
		this.nombre = nombre;
		this.area = area;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.requisitos = requisitos;
		this.empresa = empresa;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}
}
