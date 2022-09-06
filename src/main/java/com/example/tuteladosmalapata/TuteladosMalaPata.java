package com.example.tuteladosmalapata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TuteladosMalaPata {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TuteladosMalaPata.class, args);

		DogRepository repository = context.getBean(DogRepository.class);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		Dog pucho = new Dog (null, "Pucho", 2010, 5, 23, "Pitbull");
		repository.save(pucho);

		System.out.println(repository.findAll());


	}

}
