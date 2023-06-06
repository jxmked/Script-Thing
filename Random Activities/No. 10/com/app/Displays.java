package com.app;

public abstract class Displays {

  protected String client_name;

  public void intro_banner() {
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
