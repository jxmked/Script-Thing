package com.app;

import com.ThrowableExceptions.NoAvailablePatternException;
import com.app.Utils;
import com.validators.StringValidator;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Utils {

  private static final StringValidator validate = new StringValidator();

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
        System.out.println("Runtime error occured.\n\nExiting...");
        System.exit(1);
      }

      System.out.println("\nUsername must be a valid character");
      System.out.println(
        "Valid characters: a-zA-Z0-9-_ from 3 to 20 characters\n\n"
      );
    } while (true);
  }
}
