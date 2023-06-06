package com.app;

import java.util.Locale;
import java.util.Scanner;

public class Utils {

  public static Scanner scanner = new Scanner(System.in);

  public static String inStr() {
    return scanner.nextLine();
  }

  public static void close() {
    scanner.close();
  }

  public static String toTitleCase(String text) {
    if (text == null || text.isEmpty()) {
      return text;
    }

    String[] words = text.split("\\s+");
    final StringBuilder output = new StringBuilder();

    for (String word : words) {
      if (word.length() < 1) continue;

      String firstLetter = word
        .substring(0, 1)
        .toUpperCase(Locale.getDefault());
      String restLetters = word.substring(1).toLowerCase(Locale.getDefault());
      String titleCaseWord = firstLetter + restLetters;
      output.append(titleCaseWord);
      output.append(" ");
    }

    return output.toString().trim();
  }
}
