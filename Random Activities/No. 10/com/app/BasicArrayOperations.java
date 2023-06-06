package com.app;

import com.app.Displays;
import com.app.Utils;
import com.validators.StringValidator;

public class BasicArrayOperations extends Displays {

  private static final StringValidator validate = new StringValidator();

  public BasicArrayOperations(String client_name) {
    this.client_name = Utils.toTitleCase(client_name);

    /**
     * Match a-z characters with space and case insensitive
     * with upto 32 length of characters.
     *
     * Disallowed white space only
     * */
    validate.string_value_pattern("^(?!^\s+$)[a-z\s]{1,32}$");

    super.intro_banner();
  }
}
