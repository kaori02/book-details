package com.kaori02.graphqlserver.bookdetails;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookDetailsApplication {

  public static void main(String[] args) {
    SpringApplication.run(BookDetailsApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(BookRepository bookRepository) {
    return args -> {
//      Book book = new Book(
//          "Harry Potter and the Philosopher's Stone",
//          223,
//          "author-1"
//      );

//      bookRepository.deleteAll();
    };
  }

}
