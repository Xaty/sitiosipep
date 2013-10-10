//public class;
package com.sipep.model;

public class Empresa {

	public byte[] logotipo;
	public String nombre;
	public String giro;
	public String clasificacion;
	public String email;
	public String direccion;

	public Empresa(String nombre, String direccion, String giro,
			String clasificacion, String email) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.giro = giro;
		this.clasificacion = clasificacion;
		this.email = email;
	}

	public Empresa(String nombre, String direccion, String giro,
			String clasificacion, String email, byte[] logotipo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.giro = giro;
		this.clasificacion = clasificacion;
		this.email = email;
		this.logotipo = logotipo;
	}

	public void setLombre(byte[] logotipo) {
		this.logotipo = logotipo;
	}

	public byte[] getLogotipo() {
		return logotipo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public String getGiro() {

		return giro;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getClasificacion() {

		return clasificacion;

	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {

		return email;

	}

	public String getDireccion() {
		return direccion;
	}
	
	
	
}
