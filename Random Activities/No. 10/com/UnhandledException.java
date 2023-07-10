package com;

import java.lang.Exception;

public class UnhandledException extends Exception {

  public UnhandledException() {
    super("\nUnhandled Exception has been caught\n\nExiting...");
    this.exit();
  }
  
  public UnhandledException(String msg) {
    System.out.println("\n");
    super(msg);
    System.out.println("Exiting...");
    this.exit();
  }
  
  private void exit() {
    System.exit(1);
  }
}