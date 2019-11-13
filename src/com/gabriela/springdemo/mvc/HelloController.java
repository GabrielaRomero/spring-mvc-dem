package com.gabriela.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	
	@RequestMapping("/mostrarForm")
	public String mostrarForumario() {
		return "helloword-form";
	}
	
	@RequestMapping("/processForm")
	public String procesarForm() {
		
		return "helloword";
	}
	@RequestMapping("/processFormVersionTwo")
	public String gritemosAmigo(HttpServletRequest request, Model model) {
		//Leer el parametro de la solicitud desde el form HTML
		String theName= request.getParameter("nombre");
		//Convertir los datos a mayusculas
		theName = theName.toUpperCase();
		//Crear el mensaje
		String result = "YO! "+theName;
		//Agregar el mensaje al modelo
		model.addAttribute("message" , result);
	
		return "helloword";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String gritemosAmigoTres(@RequestParam("nombre") String  theName, 
									Model model) {
	
		//Convertir los datos a mayusculas
		theName = theName.toUpperCase();
		//Crear el mensaje
		String result = "Ey mi amigo from 3! "+theName;
		//Agregar el mensaje al modelo
		model.addAttribute("message" , result);
	
		return "helloword";
	}
}
