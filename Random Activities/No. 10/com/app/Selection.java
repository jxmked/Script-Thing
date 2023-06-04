package com.app;

import com.app.Utils;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

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
      System.out.printf("%d. %s", ++count, item);
    }
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
}
