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

import com.sipep.controler.form.FormEmpresa;

@Controller
@RequestMapping("/administrador")
public class PaginaEmpresaController {
	
	private final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/alta-empresa", method = RequestMethod.GET)
	public ModelAndView paginaAltaEmpresa(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ModelAndView model = new ModelAndView("administrador/alta-empresa");
		model.addObject("formEmpresa", new FormEmpresa());
		return model;
	}
	
	@RequestMapping(value = "/alta-empresa", method = RequestMethod.POST)
	public ModelAndView guardarEmpresa(HttpServletRequest request,
			HttpServletResponse response,
			@Valid @ModelAttribute("formEmpresa") FormEmpresa formEmpresa,
			BindingResult result) throws ServletException, IOException{
		ModelAndView m = new ModelAndView("administrador/alta-empresa");
		String valores = ToStringBuilder.reflectionToString(formEmpresa);
		
		if(result.hasErrors()){
			m.addObject(result);
		}
		else{
			System.out.print(valores);
			// TODO: guardar en el service
		}
		
		log.debug(valores);
		return m;
	}
	

}
