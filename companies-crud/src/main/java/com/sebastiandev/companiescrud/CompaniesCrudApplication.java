package com.sebastiandev.companiescrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Documentacion de las APIS: http://localhost:8081/companies-crud/swagger-ui/index.html
@SpringBootApplication
public class CompaniesCrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(CompaniesCrudApplication.class, args);
	}
}