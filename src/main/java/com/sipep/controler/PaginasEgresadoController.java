package com.sipep.controler;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/egresado")
public class PaginasEgresadoController {
	@RequestMapping(value = "/competencias-profesionales", method = RequestMethod.GET)
	public ModelAndView paginaCompetenciasProfesionales(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ModelAndView model = new ModelAndView("competencias-profesionales");
		return model;
	}

	@RequestMapping(value = "/contactanos", method = RequestMethod.GET)
	public ModelAndView paginaContactanos(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("contactanos");
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
		ModelAndView model = new ModelAndView("experiencia");
		return model;
	}

	@RequestMapping(value = "/formacion", method = RequestMethod.GET)
	public ModelAndView paginaFormacion(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("formacion");
		return model;
	}

	@RequestMapping(value = "/idiomas", method = RequestMethod.GET)
	public ModelAndView paginaIdiomas(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("idiomas");
		return model;
	}

	@RequestMapping(value = "/informacion-empresa", method = RequestMethod.GET)
	public ModelAndView paginaInformacionEmpresa(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("informacion-empresa");
		return model;
	}

	@RequestMapping(value = "/lista-empresas", method = RequestMethod.GET)
	public ModelAndView paginaListaEmpresas(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("lista-emresas");
		return model;
	}

	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	public ModelAndView paginaPerfil(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("perfil");
		return model;
	}

	@RequestMapping(value = "/registro", method = RequestMethod.GET)
	public ModelAndView paginaRegistro(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("registro");
		return model;
	}

}
