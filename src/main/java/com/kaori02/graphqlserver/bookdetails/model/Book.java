package com.kaori02.graphqlserver.bookdetails.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
  @Id
  private String id;
  private String name;
  private long pageCount;

  private String authorId;

  public Book() {
  }

  public Book(String name, long pageCount, String authorId) {
    this.name = name;
    this.pageCount = pageCount;
    this.authorId = authorId;
  }

  public String getId() {
    return id;
  }

  public String getAuthorId() {
    return authorId;
  }
}
