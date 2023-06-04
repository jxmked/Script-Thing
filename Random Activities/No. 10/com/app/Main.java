package com.app;

import com.ThrowableExceptions.NoAvailablePatternException;
import com.app.Utils;
import com.validators.StringValidator;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Utils {

  private static final StringValidator validate = new StringValidator();
  private String client_name;

  public static void main(String[] args) {
    validate.username_pattern("^([a-zA-Z0-9-_]{3,20})$");

    System.out.println("Please, enter a username to be use");
    String client_name;

    do {
      client_name = inStr();

      try {
        if (validate.username(client_name)) break;
      } catch (NoAvailablePatternException err) {
        System.out.printf("\n\n%s", err.getMessage());
        System.exit(1);
      } catch (Exception err) {
        System.out.println("\n\nRuntime error occured.\n\nExiting...");
        System.exit(1);
      }

      System.out.println("\nUsername must be a valid character");
      System.out.println(
        "Valid characters: a-zA-Z0-9-_ from 3 to 20 characters\n\n"
      );
    } while (true);

    new Main(client_name);
  }

  public Main(String client_name) {
    this.client_name = client_name;

    System.out.printf(
      "\nWelcome %s at Array Basic Operation\n",
      this.client_name
    );
    System.out.println("\nHere we are able to traverse the array of string.");
    System.out.println(
      "We can insert, modify, search, and delete values from existing array."
    );
  }

  public boolean displayMenu() {
    System.out.println("Please, select an action below:");
  }
}
