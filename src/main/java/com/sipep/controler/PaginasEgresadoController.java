package com.sipep.controler;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sipep.controler.form.FormEgresado;

@Controller
@RequestMapping("/egresado")
public class PaginasEgresadoController {
	
	private final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/competencias-profesionales", method = RequestMethod.GET)
	public ModelAndView paginaCompetenciasProfesionales(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/competencias-profesionales");
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
		return model;
	}

	@RequestMapping(value = "/experiencia", method = RequestMethod.GET)
	public ModelAndView paginaExperiencia(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/experiencia");
		return model;
	}

	@RequestMapping(value = "/formacion", method = RequestMethod.GET)
	public ModelAndView paginaFormacion(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/formacion");
		return model;
	}

	@RequestMapping(value = "/idiomas", method = RequestMethod.GET)
	public ModelAndView paginaIdiomas(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/idiomas");
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
		return model;
	}

	
	// Muestra el formulario y le mandamos un objeto vacio
	@RequestMapping(value = "/registro", method = RequestMethod.GET)
	public ModelAndView paginaRegistro(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("egresado/registro");
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
		}
		
		log.debug(valores);
		
		return model;
	}
}
