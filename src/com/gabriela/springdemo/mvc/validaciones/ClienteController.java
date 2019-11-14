package com.gabriela.springdemo.mvc.validaciones;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/custumer")
public class ClienteController {
	@RequestMapping("/showForm")
	public String showForm(Model modelCliente) {
		modelCliente.addAttribute("modeloCustumer", new Cliente());
		
		return "cliente-form";
		
	}

}
