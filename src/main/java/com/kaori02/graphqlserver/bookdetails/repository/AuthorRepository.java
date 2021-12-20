package com.kaori02.graphqlserver.bookdetails.repository;

import com.kaori02.graphqlserver.bookdetails.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AuthorRepository extends MongoRepository<Author, String> {
  List<Author> findAuthorById(String id);
}
