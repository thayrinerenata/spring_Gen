package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/exercicio1")
	public String Hello() {
		return "raiva";
	}
	
	@GetMapping("/exercicio2")
	public String Hay() {
		return "sangue nos olhos";
	}
	
	@GetMapping("/exercicio3")
	public String Hola() {
		return "mais um pouco eu surto";
	}

}
