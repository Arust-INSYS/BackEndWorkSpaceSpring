package com.springboot.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	//Cual quier peticion recibida mediante una URL
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", "Hello World!!");
		model.addAttribute("nombre", "Ariel");
		model.addAttribute("apellido", "Aguirre");
		
	return "index";
	}
}
