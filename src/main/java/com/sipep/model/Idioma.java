package com.sipep.model;
/*
 * autor: manu
 * modifcado por: mracapri
 * */
public class Idioma {
	
	public String idIdioma;
	public String idioma;
	public String nivel;
	
	public Idioma(String idIdioma, String idioma, String nivel){
		this.idIdioma = idIdioma;
		this.idioma = idioma;
		this.nivel = nivel;
	}

	public String getIdioma() {
		return idioma;
	}

	public String getNivel() {
		return nivel;
	}
	
	

}
