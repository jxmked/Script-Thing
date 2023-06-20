package com;

public class UnhandledException {
  public UnhandledException() {
    System.out.println("\nUnhandled Exception has been caught\n\nExiting...");
    this.exit();
  }
  
  public UnhandledException(String msg) {
    System.out.println("\n");
    System.out.print(msg);
    System.out.println("Exiting...");
    this.exit();
  }
  
  private void exit() {
    System.exit(1);
  }
}