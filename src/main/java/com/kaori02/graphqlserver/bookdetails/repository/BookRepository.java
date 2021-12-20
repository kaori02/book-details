package com.kaori02.graphqlserver.bookdetails.repository;

import com.kaori02.graphqlserver.bookdetails.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
  List<Book> findBookById(String id);
}
