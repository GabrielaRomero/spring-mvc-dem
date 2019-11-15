package com.gabriela.springdemo.mvc.validaciones;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/custumer")
public class ClienteController {
	
	//Metodo para borrar espacio en blanco inicial y final  en cada una de las cadenas d todas la
	//solicitudes del este controlador 
	//se llamara este metodo para cada solicitud
	@InitBinder
	public void inintBinder(WebDataBinder dataBinder) {
		//Todo espacio en blanco recortarlo a nulo "True"
		StringTrimmerEditor stringTimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTimmerEditor);
		
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model modelCliente) {
		modelCliente.addAttribute("modeloCustumer", new Cliente());
		
		return "cliente-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(
							 @Valid @ModelAttribute("modeloCustumer") Cliente thecustumer, 
							 BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "cliente-form";
		}else {
			return "cliente-confirmacion";
		}
	}

}
