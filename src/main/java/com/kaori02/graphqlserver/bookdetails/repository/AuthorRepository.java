package com.kaori02.graphqlserver.bookdetails.repository;

import com.kaori02.graphqlserver.bookdetails.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
