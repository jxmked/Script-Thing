package com.ThrowableExceptions;

import java.lang.Exception;

public class UpdateFailure extends Exception {

  public UpdateFailure() {
    super();
  }

  public UpdateFailure(String message) {
    super(message);
  }
}
