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

  public boolean username(String text)
    throws NoAvailablePatternException, Exception {
    try {
      this.is_pattern_exists("username");

      final Pattern pattern = this.patterns.get("username");
      final Matcher matcher = pattern.matcher(text);

      return matcher.matches();
    } catch (Exception err) {
      throw err;
    }
  }

  private void is_pattern_exists(String key)
    throws NoAvailablePatternException {
    if (!this.patterns.containsKey(key)) {
      throw new NoAvailablePatternException(
        String.format("No available pattern for %s", key)
      );
    }
  }
}
