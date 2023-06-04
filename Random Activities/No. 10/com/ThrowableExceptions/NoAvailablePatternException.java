package com.ThrowableExceptions;

import java.lang.Exception;

public class NoAvailablePatternException extends Exception {

  public NoAvailablePatternException() {
    super();
  }

  public NoAvailablePatternException(String message) {
    super(message);
  }
}
