package com.validators;

import com.ThrowableExceptions.NoAvailablePatternException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

  private final Map<String, Pattern> patterns = new HashMap<>();

  public StringValidator() {}

  /**
   * Set patterns
   * */
  public void username_pattern(String pattern) {
    this.patterns.put("username", Pattern.compile(pattern));
  }

  public void string_value_pattern(String pattern) {
    this.patterns.put("string_value", Pattern.compile(pattern));
  }

  /**
   * Tester
   * */
  public boolean username(String text)
    throws NoAvailablePatternException, Exception {
    /**
     * Validate username
     * */
    try {
      this.is_pattern_exists("username");

      final Pattern pattern = this.patterns.get("username");
      final Matcher matcher = pattern.matcher(text);

      return matcher.matches();
    } catch (Exception err) {
      throw err;
    }
  }

  public boolean string_value(String text)
    throws NoAvailablePatternException, Exception {
    /**
     * Validate string value.
     * The string that will be stored in variable array
     * */
    try {
      this.is_pattern_exists("string_value");

      final Pattern pattern = this.patterns.get("string_value");
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
