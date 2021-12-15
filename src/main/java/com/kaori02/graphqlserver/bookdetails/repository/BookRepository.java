package com.kaori02.graphqlserver.bookdetails.repository;

import com.kaori02.graphqlserver.bookdetails.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
