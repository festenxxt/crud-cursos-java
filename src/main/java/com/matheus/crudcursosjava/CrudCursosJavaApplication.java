package com.matheus.crudcursosjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.matheus.crudcursosjava.model.Course;
import com.matheus.crudcursosjava.repository.CourseRepository;

@SpringBootApplication
public class CrudCursosJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudCursosJavaApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Sping");
			c.setCategory("Front-end");

			courseRepository.save(c);
		};
	}
}
