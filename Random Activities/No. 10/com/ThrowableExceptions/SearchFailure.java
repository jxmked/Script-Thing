package com.ThrowableExceptions;

import java.lang.Exception;

public class SearchFailure extends Exception {

  public SearchFailure() {
    super();
  }

  public SearchFailure(String message) {
    super(message);
  }
}
