package com.sipep.model;

public class Administrador{
	public String correo;
	public String nombre;
	
	public void setNombre(String nombre){
		this.nombre = nombre;		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getCorreo(){
		return correo;
	}
	
	public Administrador(String correo, String nombre){
		this.correo = correo;
		this.nombre = nombre;
	}
	
	public void creaOferta(){}
	public void asignarOferta(){}
	public void enviarCorreo(){}
	public void altaEmpresa(){}
	public void bajaEmpresa(){}
	public void consultarOferta(){}
	public void verCurriculum(){}
	public void subirOferta(){}
	
}