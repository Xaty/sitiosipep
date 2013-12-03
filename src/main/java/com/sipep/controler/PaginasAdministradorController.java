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
import com.sipep.controler.form.FormOferta;

@Controller
@RequestMapping("/administrador")
public class PaginasAdministradorController {

	private final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/asignar-oferta", method = RequestMethod.GET)
	public ModelAndView paginaAsignarOferta(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("administrador/asignar-oferta");
		return model;
	}
	
	@RequestMapping(value = "/envio-ofertas-laborales", method = RequestMethod.GET)
	public ModelAndView paginaEnvioOfertasLaborales(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("administrador/envio-ofertas-laborales");
		return model;
	}
	
	@RequestMapping(value = "/subir-oferta", method = RequestMethod.GET)
	public ModelAndView paginaSubirOferta(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int dias[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31 };
		String mes[] = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
		int anios[] = {2000, 2001,
				2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009,
				2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017,
				2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025, 
				2026, 2027, 2028, 2029, 2030};
		String area [] = {"TIC", "Metal Mecanica", "Mecatronica", "Procesos Bioalimentarios", "AyEP", "Turismo", "Gastronimia"};
		ModelAndView model = new ModelAndView("administrador/subir-oferta");
		model.addObject("dia", dias);
		model.addObject("mes", mes);
		model.addObject("anio", anios);
		model.addObject("area", area);
		
		model.addObject("formOferta", new FormOferta());
		return model;
	}
	
	@RequestMapping(value = "/subir-oferta", method = RequestMethod.POST)
	public ModelAndView guardarOferta(HttpServletRequest request,
			HttpServletResponse response, 
			@Valid @ModelAttribute("formOferta") FormOferta formOferta,
			BindingResult result) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("administrador/subir-oferta");
		
		String valores = ToStringBuilder.reflectionToString(formOferta);
		
		if(result.hasErrors()){
			model.addObject(result);
		}else{
			log.debug(valores);
		}
		return model;
	}
}
