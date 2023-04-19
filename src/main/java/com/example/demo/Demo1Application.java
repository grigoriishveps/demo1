package com.example.demo;

import com.example.demo.models.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);

		BookRepository repository = context.getBean(BookRepository.class);
		repository.save(new Book(4L, "Bauer"));
		repository.save(new Book(5L, "O'Brian"));

	}

}
