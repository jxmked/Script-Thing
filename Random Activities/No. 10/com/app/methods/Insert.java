package com.app.methods;

import com.ThrowableExceptions.InsertionFailure;
import com.UnhandledException;
import com.app.Storage;
import com.app.interfaces.MethodInterface;

public final class Insert extends Storage {

  public Insert(String text) throws InsertionFailure {
    try {
      super.insert(text);
    } catch (InsertionFailure err) {
      throw err;
    } catch (Exception err) {
      new UnhandledException();
    }
  }
}
