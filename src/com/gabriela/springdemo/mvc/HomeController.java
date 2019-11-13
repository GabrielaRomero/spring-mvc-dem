package com.gabriela.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Se indica que es un controlador de mvc
public class HomeController {
	
	@RequestMapping("/") //solicitud de mapeo
	public String sowPage() {
		return "main-menu";
		
	}

}
