package com.sipep.model;

import java.util.ArrayList;
import java.util.List;

/*
 * autor: manu
 * modifcado por: mracapri
 * */
public class CurriculumVitae {
	
	private String idCurriculum;
	private List<FormacionAcademica> formacionesAcademicas;
	private List<Experiencia> experiencias;
	private List<Curso> cursos;
	private List<Idioma> idiomas;
	private String habilidades;
	private Egresado egresado;
	
	
	public CurriculumVitae(String id, Egresado egresado) {
		this.idCurriculum = id;
		this.egresado = egresado;
		formacionesAcademicas = new ArrayList<FormacionAcademica>();
		experiencias = new ArrayList<Experiencia>();
		cursos = new ArrayList<Curso>();
		idiomas = new ArrayList<Idioma>();
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public List<FormacionAcademica> getFormacionesAcademicas() {
		return formacionesAcademicas;
	}

	public List<Experiencia> getExperiencias() {
		return experiencias;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public List<Idioma> getIdiomas() {
		return idiomas;
	}

	public String getIdCurriculum() {
		return idCurriculum;
	}

	
}
