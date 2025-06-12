package com.products.productsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProdutosApiApplication {
	//Criando hello world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
	}

}
