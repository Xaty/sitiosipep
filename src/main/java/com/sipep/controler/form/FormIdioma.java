package com.sipep.controler.form;

import org.hibernate.validator.constraints.NotBlank;

public class FormIdioma {
	
	@NotBlank
	private String idioma;
	private String nivel;
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
