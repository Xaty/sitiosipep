package com.sipep.model;

public class Cursos {
	
	public String nomCapa;
	public String institucion;
	public String periodoCurso;
	
	public void setNomCapa(String nomCapa){
		this.nomCapa = nomCapa;
	}
	
	public String getNomCapa(){
		return nomCapa;
	}
	
	public void setInstitucion(String inst){
		this.institucion = inst;
	}
	
	public String getInstitucion(){
		return institucion;
	}
	
	public void setPeriodoCurso(String per){
		this.periodoCurso = per;
	}
	
	public String getPeriodoCurso(){
		return periodoCurso;
	}

}
