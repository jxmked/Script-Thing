package com.app;

import com.app.Utils;
import com.validators.StringValidator;

public class BasicArrayOperations {

  private String client_name;
  private static final StringValidator validate = new StringValidator();

  public BasicArrayOperations(String client_name) {
    this.client_name = client_name;
    /**
     * Match a-z characters with space and case insensitive
     * with upto 32 length of characters.
     *
     * Disallowed white space only
     * */
    validate.string_value_pattern("^(?!^\s+$)[a-z\s]{1,32}$");

    System.out.printf(
      "\nWelcome %s at Array Basic Operation\n",
      this.client_name
    );
    System.out.println("\nHere we are able to traverse the array of string.");
    System.out.println(
      "We can insert, modify, search, and delete values from existing array."
    );
  }
}
