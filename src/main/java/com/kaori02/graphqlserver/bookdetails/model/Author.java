package com.kaori02.graphqlserver.bookdetails.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authors")
public class Author {
  @Id
  private String id;
  private String firstName;
  private String lastName;

  public Author() {
  }

  public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }


  public String getId() {
    return id;
  }
}
