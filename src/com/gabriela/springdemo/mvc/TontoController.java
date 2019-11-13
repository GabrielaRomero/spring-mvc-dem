package com.gabriela.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TontoController {
	
	@RequestMapping("/mostrarForm")
	public String displayTheForm() {
		return "Tonto";
	}

}
