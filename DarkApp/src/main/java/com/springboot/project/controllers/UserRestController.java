package com.springboot.project.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.models.User;
import com.springboot.project.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

	// Cual quier peticion recibida mediante una URL
	@GetMapping("/indexDto")
	public UserDto index() {
		UserDto userDto = new UserDto();

		User user = new User("Ariel", "Aguirre");
		userDto.setUser(user);
		userDto.setTitle("Hello World");

		return userDto;
	}

	// GET MAPPING: Cual quier peticion recibida mediante una URL
	@GetMapping("/indexMap")
	public Map<String, Object> index_map() {

		User user = new User("Ariel", "Aguirre");
		Map<String, Object> body = new HashMap<>();
		body.put("titulo", "Hello World!!");
		body.put("user", user);

		return body;
	}

	@GetMapping("/list")
	public List<User> list() {
		User user1 = new User("Ariel", "Aguirre");
		User user2 = new User("Cesar", "Aguirre");
		User user3 = new User("Carlos", "Aguirre");
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		//Uso de helpers
		//List<User> usuarios = Arrays.asList(user1,user2,user3);

		return users;
	}
}
