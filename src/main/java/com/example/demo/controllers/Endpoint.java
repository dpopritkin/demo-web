package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.db.repositories.FruitRepository;

@Controller
public class Endpoint {
	
	@Autowired
	private FruitRepository fruitRepository;
	
	@GetMapping("/congrats")
	public ResponseEntity<String> congrats() {
		return ResponseEntity.ok("hola");
	}
	
	@GetMapping("/fruit")
	public ResponseEntity<String> getFruit() {
		return ResponseEntity.ok(
				fruitRepository.findById(1).get().getName()
				);
	}

}
