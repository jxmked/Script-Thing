package com.app;

import com.ThrowableExceptions.InvaidArgumentTypeException;
import com.app.Utils;
import java.util.HashSet;
import java.util.Set;

public class Selection extends Utils {

  private final Set<String> selection_set = new HashSet<>();
  private String answer;

  public Selection() {}

  public void add_option(String option) {
    this.selection_set.add(option);
  }

  public void print_selections() {
    int count = 0;

    for (String item : this.selection_set) {
      System.out.printf("%d. %s\n", ++count, item);
    }
  }

  public void ask() {
    this.ask(false);
  }

  public void ask(boolean can_be_null) {
    String answer;
    do {
      answer = inStr().trim();

      if (answer != null || !answer.isEmpty()) {
        this.answer = answer;
        break;
      }
    } while (!can_be_null);
  }

  public String get_answer() {
    return this.answer;
  }

  public boolean is_on_range(String text)
    throws InvaidArgumentTypeException, Exception {
    try {
      final int parsed_value = Integer.parseInt(text);
      return (this.selection_set.size() >= parsed_value && parsed_value >= 1);
    } catch (NumberFormatException err) {
      throw new InvaidArgumentTypeException(
        "Selection.is_on_list expecting a string integer value."
      );
    } catch (Exception err) {
      throw new RuntimeException("No error handling available at this time.");
    }
  }
}
