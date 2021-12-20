package com.kaori02.graphqlserver.bookdetails;

import com.kaori02.graphqlserver.bookdetails.model.Author;
import com.kaori02.graphqlserver.bookdetails.model.Book;
import com.kaori02.graphqlserver.bookdetails.repository.AuthorRepository;
import com.kaori02.graphqlserver.bookdetails.repository.BookRepository;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class GraphQLDataFetchers {
  @Autowired
  AuthorRepository authorRepository;
  @Autowired
  BookRepository bookRepository;

  public DataFetcher getBookByIdDataFetcher() {
    return dataFetchingEnvironment -> {
      String bookId = dataFetchingEnvironment.getArgument("id");
      List<Book> books = bookRepository.findBookById(bookId);
      return books
          .stream()
          .filter(Book -> Book.getId().equals(bookId))
          .findFirst()
          .orElse(null);
    };
  }

  public DataFetcher getAuthorDataFetcher() {
    return dataFetchingEnvironment -> {
      System.out.println("BOOK TYPE: "+dataFetchingEnvironment.getSource().getClass());
      Book book = dataFetchingEnvironment.getSource();
      String authorId = book.getAuthorId();
      List<Author> authors = authorRepository.findAuthorById(authorId);
      return authors
          .stream()
          .filter(Author -> Author.getId().equals(authorId))
          .findFirst()
          .orElse(null);
    };
  }
}