package com.kaori02.graphqlserver.bookdetails.controller;

import com.kaori02.graphqlserver.bookdetails.GraphQLProvider;
import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  private GraphQL graphQL;
  private GraphQLProvider graphQLProvider;

  @Autowired
  MainController(GraphQLProvider graphQLProvider) {
    this.graphQLProvider = graphQLProvider;
    graphQL = graphQLProvider.graphQL();
  }

  @PostMapping(value = "/query")
  public ResponseEntity query(@RequestBody String query){
    ExecutionResult result = graphQL.execute(query);
    System.out.println("errors: "+result.getErrors());
    return ResponseEntity.ok(result.getData());
  }
}
