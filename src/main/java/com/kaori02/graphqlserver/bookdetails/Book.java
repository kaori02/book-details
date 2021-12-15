package com.kaori02.graphqlserver.bookdetails;

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

  public String getName() {
    return name;
  }

  public long getPageCount() {
    return pageCount;
  }

  public String getAuthorId() {
    return authorId;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPageCount(long pageCount) {
    this.pageCount = pageCount;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }
}
