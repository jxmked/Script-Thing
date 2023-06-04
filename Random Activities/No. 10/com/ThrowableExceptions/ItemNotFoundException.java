package com.ThrowableExceptions;

import java.lang.Exception;

public class ItemNotFoundException extends Exception {

  public ItemNotFoundException() {
    super();
  }

  public ItemNotFoundException(String message) {
    super(message);
  }
}
