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
@RequestMapping("/administrador")
public class PaginasAdministradorController {

	
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
		ModelAndView model = new ModelAndView("administrador/subir-oferta");
		return model;
	}
}
