package com.gabriela.springdemo.mvc.tags;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/student")
public class StudentController {
	
	//Inyectar valores del .properties.
	@Value("#{propertiesOpcionesCity}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String mostrarForma(Model model) {
		//Creara un objeto de estudiante
		Estudiante estudiante = new Estudiante();
		
		//Agrgar el objeto estudiante al modelo generar un nmbre se ese modelo
		model.addAttribute("studentModel",estudiante);
		
		//Agregar la lista de opciones al modelo
		model.addAttribute("theCountryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("studentModel") Estudiante  thEstudiante) {
		//log the input data
		System.out.println("El estudiante "+thEstudiante.getNombre() +" "+ thEstudiante.getApellido());
		return "student-confirmation";
	}

}
