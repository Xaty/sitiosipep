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
import org.springframework.web.servlet.ModelAndView;

import com.sipep.controler.form.FormEgresado;
import com.sipep.model.Egresado;
import com.sipep.service.EgresadoService;

@Controller
@RequestMapping("/egresado")
public class PaginasEgresadoController {
	
	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private EgresadoService service;
	
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
		
		int dias[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31 };
		
		String meses [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Julio", "Agosto", "Septiembre", "Octubre",
				"Noviembre", "Diciembre" };

		String anios[] = {"1980", "1981", "1982", "1983", "1984", "1985",
				"1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993",
				"1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001",
				"2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
				"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
				"2018", "2019", "2020" };
		
		ModelAndView model = new ModelAndView("egresado/registro");
		
		// se envian a la vista
		model.addObject("dias", dias);				 
		//model.addObject("meses", meses);
		//model.addObject("anios", anios);
		
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
			//formEgresado.getDia();
			//formEgresado.getMes();
			//formEgresado.getAnio();
			//Egresado e = new Egresado(id, nombre, apellidoPaterno, apellidoMaterno, curp, correo, sexo, estatus)
			//service.registrarEgresado(e);
			
		}
		
		log.debug(valores);
		
		return model;
	}
}
