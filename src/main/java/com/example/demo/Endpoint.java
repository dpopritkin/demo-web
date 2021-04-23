package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Endpoint {
	
	@GetMapping("/congrats")
	public ResponseEntity<String> congrats() {
		return ResponseEntity.ok("hola");
	}

}
