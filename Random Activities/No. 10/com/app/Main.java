package com.app;

import com.ThrowableExceptions.NoAvailablePatternException;
import com.app.BasicArrayOperations;
import com.app.Utils;
import com.validators.StringValidator;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static final StringValidator validate = new StringValidator();

  public static void main(String[] args) {
    validate.username_pattern("^([a-zA-Z0-9-_]{3,20})$");

    System.out.println("Please, enter a username to be use");
    String client_name;

    do {
      /**
       * Get the user name before vontinueing
       * */
      client_name = Utils.inStr().trim();

      try {
        /**
         * Check if the user name is valid or in pattern defined
         * above.
         * 
         * If valid, break the loop and instantiate the main (BasicArrayOperations) app
         * */
        if (validate.username(client_name)) break;
      } catch (NoAvailablePatternException err) {
        
        
        /**
         * If we don't have any pattern provided to test the username,
         * the validator will throw a NoAvailablePatternException Exception
         * that needed to catch for error handling then exit.
         * */
        System.out.printf("\n\n%s", err.getMessage());
        System.exit(1);
      } catch (Exception err) {
        
        /**
         * Other error well be our runtime error.
         * Exit needed since we don't have any other operation to do so.
         * */
        System.out.println("\n\nRuntime error occured.\n\nExiting...");
        System.exit(1);
      }
      
      /**
       * Invalid Username will reach this.
       * */
      System.out.println("\nUsername must be a valid character");
      System.out.println(
        "Valid characters: a-zA-Z0-9-_ from 3 to 20 characters\n\n"
      );
    } while (true);
    
    /**
     * Create instance of the main app.
     * */
    new BasicArrayOperations(client_name);
  }
}
