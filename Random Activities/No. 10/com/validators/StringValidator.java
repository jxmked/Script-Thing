package com.validators;

import com.ThrowableExceptions.NoAvailablePatternException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

  private final Map<String, Pattern> patterns = new HashMap<>();

  public StringValidator() {}

  public void username_pattern(String pattern) {
    this.patterns.put("username", Pattern.compile(pattern));
  }

  public boolean username(String text) throws NoAvailablePatternException {
    if (!this.patterns.containsKey("username")) {
      throw new NoAvailablePatternException(
        "No available pattern for username"
      );
    }

    final Pattern pattern = this.patterns.get("username");
    final Matcher matcher = pattern.matcher(text);

    return matcher.matches();
  }
}
