package com.ThrowableExceptions;

import java.lang.Exception;

public class InsertionFailure extends Exception {

  public InsertionFailure() {
    super();
  }

  public InsertionFailure(String message) {
    super(message);
  }
}
