package com.ThrowableExceptions;

import java.lang.Exception;

public class DeletionFailure extends Exception {

  public DeletionFailure() {
    super();
  }

  public DeletionFailure(String message) {
    super(message);
  }
}
