package com.kaori02.graphqlserver.bookdetails;

import com.kaori02.graphqlserver.bookdetails.model.Author;
import com.kaori02.graphqlserver.bookdetails.model.Book;
import com.kaori02.graphqlserver.bookdetails.repository.AuthorRepository;
import com.kaori02.graphqlserver.bookdetails.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookDetailsApplication {

  public static void main(String[] args) {
    SpringApplication.run(BookDetailsApplication.class, args);
  }

//  @Bean
//  CommandLineRunner runner(BookRepository bookRepository, AuthorRepository authorRepository) {
//    return args -> {
//      List<Author> authors = new ArrayList<>();
//      List<Book> books = new ArrayList<>();
//
//      authorRepository.deleteAll();
//      bookRepository.deleteAll();
//
//      authors.add(new Author("Joanne", "Rowling"));
//      authors.add(new Author("Herman", "Melville"));
//      authors.add(new Author("Anne", "Rice"));
//      authorRepository.insert(authors);
//
//      books.add(new Book(
//          "Harry Potter and the Philosopher's Stone",
//          223,
//          authors.get(0).getId().toString()
//      ));
//      books.add(new Book(
//          "Moby Dick",
//          635,
//          authors.get(1).getId().toString()
//
//      ));
//      books.add(new Book(
//          "Interview with the vampire",
//          371,
//          authors.get(2).getId().toString()
//      ));
//      bookRepository.insert(books);
//    };
//  }
}
