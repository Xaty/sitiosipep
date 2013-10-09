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
@RequestMapping("/public")
public class PaginasAdministradorController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView paginaIndex(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value = "/tips", method = RequestMethod.GET)
	public ModelAndView paginaTips(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("tips");
		return model;
	}
}
