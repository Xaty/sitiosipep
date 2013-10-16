package com.sipep.model;

import java.util.Date;
/*
 * autor: manu
 * modifcado por: mracapri
 * */
public class Egresado {

	private String idEgresado;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String curp;
	private String correo;
	private Sexo sexo;
	private Estatus estatus;

	private String direccion; // sacar atributo a clase nueva
	private String codigoPostal; // sacar atributo a clase nueva
	private Date fechaNacimiento;
	// public int edad;
	/*
	 * se elimina atributo edad por que se puede calcular en base a la fecha de
	 * nacimiento
	 */
	private String cedulaProfesional; // imagen	
	private byte[] fotografia; // imagen

	/*
	 * Recibe los valores minimos obligatorios y siginificativos para el
	 * egresado
	 */
	public Egresado(String id, String nombre, String apellidoPaterno,
			String apellidoMaterno, String curp, String correo, Sexo sexo,
			Estatus estatus) {
		this.idEgresado = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.curp = curp;
		this.correo = correo;
		this.sexo = sexo;
		this.estatus = estatus;
	}

	/*
	 * Recibe los valores minimos obligatorios, mas fotografia para el egresado
	 */
	public Egresado(String nombre, String apellidoPaterno,
			String apellidoMaterno, String curp, String correo, Sexo sexo,
			String estatus, byte[] fotografia) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.curp = curp;
		this.correo = correo;
		this.sexo = sexo;
		this.fotografia = fotografia;
	}

	public void crearCurriculum() {}
	public void crearPerfil() {}
	public void consultaOferta() {}
	public void actualizarPerfil() {}
	public void actualizarCurriculum() {}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public String getCurp() {
		return curp;
	}

	public String getCorreo() {
		return correo;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public Estatus getEstatus() {
		return estatus;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

}