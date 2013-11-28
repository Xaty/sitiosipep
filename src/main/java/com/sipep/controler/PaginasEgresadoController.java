package com.sipep.controler;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sipep.controler.form.FormCurriculumVitae;
import com.sipep.controler.form.FormCurso;
import com.sipep.controler.form.FormEgresado;
import com.sipep.controler.form.FormExperiencia;
import com.sipep.controler.form.FormFormacion;
import com.sipep.controler.form.FormIdioma;
import com.sipep.controler.form.FormPerfil;
import com.sipep.model.Egresado;
import com.sipep.model.Estatus;
import com.sipep.model.Sexo;
import com.sipep.service.EgresadoService;

@Controller
@RequestMapping("/egresado")
@SessionAttributes({"dias", "meses", "anios"})
public class PaginasEgresadoController {
	
	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private EgresadoService service;
	
	@RequestMapping(value = "/competencias-profesionales", method = RequestMethod.GET)
	public ModelAndView paginaCompetenciasProfesionales(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/competencias-profesionales");
		model.addObject("formCurriculumVitae", new FormCurriculumVitae());
		return model;
	}
	
	//Guardar competencias profesionales
	@RequestMapping(value = "/competencias-profesionales", method = RequestMethod.POST)
	public ModelAndView guardarCompetencia(HttpServletRequest request,
			HttpServletResponse response, 
			@Valid @ModelAttribute("formCurriculumVitae") FormCurriculumVitae formCurriculumVitae,
			BindingResult result) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/competencias-profesionales");
		
		String v = ToStringBuilder.reflectionToString(formCurriculumVitae);
		log.debug(v);
		
		System.out.print(formCurriculumVitae);
		// TODO: almacenar habilidades
		
		return model;
	}

	@RequestMapping(value = "/contactanos", method = RequestMethod.GET)
	public ModelAndView paginaContactanos(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/contactanos");
		return model;
	}

	@RequestMapping(value = "/cursos", method = RequestMethod.GET)
	public ModelAndView paginaCursos(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/cursos");
		model.addObject("formCurso", new FormCurso());
		return model;
	}
	
	//guardar curso
	@RequestMapping(value = "/cursos", method = RequestMethod.POST)
	public ModelAndView guardarCursos(HttpServletRequest request,
			HttpServletResponse response, 
			@Valid @ModelAttribute("formCurso") FormCurso formCurso,
			BindingResult result) throws ServletException, IOException{
		ModelAndView model = new ModelAndView("egresado/cursos");

		String val = ToStringBuilder.reflectionToString(formCurso);
		
		if(result.hasErrors()){
			model.addObject(result);
		}
		else{
			//TODO: almacenar cursos
			log.debug(val);
		}
		return model;
	}

	@RequestMapping(value = "/experiencia", method = RequestMethod.GET)
	public ModelAndView paginaExperiencia(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/experiencia");
		model.addObject("formExperiencia", new FormExperiencia());
		return model;
	}
	
	@RequestMapping(value = "/experiencia", method = RequestMethod.POST)
	public ModelAndView guardarExperiencia(HttpServletRequest request,
			HttpServletResponse response, 
			@Valid @ModelAttribute("formExperiencia") FormExperiencia formExperiencia,
			BindingResult result) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/experiencia");
		
		String val = ToStringBuilder.reflectionToString(formExperiencia);
		if(result.hasErrors()){
			model.addObject(result);
		}else{
			// TODO: almacenar experiencia
			log.debug(val);
		}
		
		return model;
	}

	@RequestMapping(value = "/formacion", method = RequestMethod.GET)
	public ModelAndView paginaFormacion(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/formacion");
		model.addObject("formFormacion", new FormFormacion());
		return model;
	}
	
	//guardar datos
	@RequestMapping(value = "/formacion", method = RequestMethod.POST)
	public ModelAndView guardarFormacion(HttpServletRequest request,
			HttpServletResponse response, 
			@Valid @ModelAttribute("formFormacion") FormFormacion formFormacion,
			BindingResult result) throws ServletException, IOException{
		ModelAndView model = new ModelAndView("egresado/formacion");
		
		String val = ToStringBuilder.reflectionToString(formFormacion);
		
		if(result.hasErrors()){
			model.addObject(val);
		}else{
			log.debug(val);
		}
		return model;
	}

	@RequestMapping(value = "/idiomas", method = RequestMethod.GET)
	public ModelAndView paginaIdiomas(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nivel[] = {"Basico","Intermedio","Avanzado"};
		ModelAndView model = new ModelAndView("egresado/idiomas");
		model.addObject("nivel", nivel);
		model.addObject("formIdioma", new FormIdioma());
		
		return model;
	}
	
	//guardar idiomas
	@RequestMapping(value = "/idiomas", method = RequestMethod.POST)
	public ModelAndView guardarIdioma(HttpServletRequest request,
			HttpServletResponse response, 
			@Valid @ModelAttribute("formIdioma") FormIdioma formIdioma,
			BindingResult result) throws ServletException, IOException{
		ModelAndView model = new ModelAndView("egresado/idiomas");
		
		String val = ToStringBuilder.reflectionToString(formIdioma);
		
		if(result.hasErrors()){
			model.addObject(val);
		}else{
			log.debug(val);
		}
		return model;
	}

	@RequestMapping(value = "/informacion-empresa", method = RequestMethod.GET)
	public ModelAndView paginaInformacionEmpresa(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/informacion-empresa");
		return model;
	}

	@RequestMapping(value = "/lista-empresas", method = RequestMethod.GET)
	public ModelAndView paginaListaEmpresas(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/lista-empresas");
		return model;
	}

	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	public ModelAndView paginaPerfil(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/perfil");
		model.addObject("formPerfil", new FormPerfil());
		return model;
	}
	
	// Guardar perfil
	@RequestMapping(value = "/perfil", method = RequestMethod.POST)
	public ModelAndView guardarPerfil(HttpServletRequest request,
			HttpServletResponse response, 
			@Valid @ModelAttribute("formPerfil") FormPerfil formPerfil,
			BindingResult result) throws ServletException, IOException{
		ModelAndView model = new ModelAndView("egresado/perfil");
		
		String val = ToStringBuilder.reflectionToString(formPerfil);
		
		if(result.hasErrors()){
			model.addObject(val);
		}else{
			log.debug(val);
		}
		
		return model;
	}

	
	// Muestra el formulario y le mandamos un objeto vacio
	@RequestMapping(value = "/registro", method = RequestMethod.GET)
	public ModelAndView paginaRegistro(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int dias[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31 };
		
		int meses [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		int anios[] = {1980, 1981, 1982, 1983, 1984, 1985,
				1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993,
				1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001,
				2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009,
				2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017,
				2018, 2019, 2020 };
		
		ModelAndView model = new ModelAndView("egresado/registro");
		
		// se envian a la vista
		model.addObject("dias", dias);				 
		model.addObject("meses", meses);
		model.addObject("anios", anios);
		
		model.addObject("formEgresado", new FormEgresado());
		
		return model;
	}

	@RequestMapping(value = "/guardar-egresado", method = RequestMethod.POST)
	public ModelAndView guardarEgresado(HttpServletRequest request,
			HttpServletResponse response, 
			@Valid @ModelAttribute("formEgresado") FormEgresado formEgresado,
			BindingResult result) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/registro");

		String valores = ToStringBuilder.reflectionToString(formEgresado);
		
		if(result.hasErrors()){
			model.addObject(result);
		}else{
			//TODO: llave primaria del constructor
			Egresado e = new Egresado("1", formEgresado.getNombre(), formEgresado.getApellidoPaterno(), formEgresado.getApellidoMaterno(), formEgresado.getCurp(), formEgresado.getCorreo(), Sexo.get(formEgresado.getSexo()), Estatus.INACTIVO);
			service.registrarEgresado(e);
			
		}
		
		log.debug(valores);
		
		return model;
	}
}
