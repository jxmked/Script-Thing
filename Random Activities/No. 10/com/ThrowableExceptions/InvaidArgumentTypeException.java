package com.ThrowableExceptions;

import java.lang.Exception;

public class InvaidArgumentTypeException extends Exception {

  public InvaidArgumentTypeException() {
    super();
  }

  public InvaidArgumentTypeException(String message) {
    super(message);
  }
}
