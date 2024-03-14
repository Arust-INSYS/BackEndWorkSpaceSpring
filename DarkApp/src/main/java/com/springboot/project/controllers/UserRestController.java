package com.springboot.project.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

	//Cual quier peticion recibida mediante una URL
	@GetMapping("/index")
	public Map<String,Object> index() {
		
		User user = new User("Ariel","Aguirre");
		Map<String, Object> body = new HashMap<>();
		body.put("titulo", "Hello World!!");
		body.put("user", user);
		
		
	return body;
	}
}
