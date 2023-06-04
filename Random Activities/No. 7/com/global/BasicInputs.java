package com.global;

/**
 * Optional Impors
 * */
import java.util.Scanner;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

public class BasicInputs {

  /**
   * Close this after using it.
   */
  public static Scanner scanner = new Scanner(System.in);

  /**
   * System.out.println Shorthands. =)
   */
  public static void print(String str) {
    System.out.println(str);
    System.out.flush();
  }

  public static void print(int num) {
    System.out.println(num);
    System.out.flush();
  }

  public static void print(Boolean num) {
    System.out.println(num);
    System.out.flush();
  }

  /**
   * Confirmation funtion that accepts Yes or No, Y or N, y or n
   *
   * @param str
   * @return returns true if Y or Yes, otherwise false
   */
  public static boolean Confirm(String str) {
    print(str);

    char res;

    while (true) {
      print("[Y/n]: ");

      res = inChar();

      if (String.valueOf(res).trim().isEmpty()) {
        continue;
      }

      switch (res) {
        case 'y':
        case 'Y':
          return true;
        case 'n':
        case 'N':
          return false;
      }
    }
  }

  /**
   * Clear Screen
   *
   */
  public static void clrscr() {
    /**
     * From Stackoverflow and has been modified
     */

    try {
      final String os = System.getProperty("os.name");
      ProcessBuilder processBuilder = new ProcessBuilder("");

      if (os.contains("Windows")) {
        processBuilder.command("cmd", "/c", "cls");
        processBuilder.inheritIO().start().waitFor();
      } else {
        // Works on my terminal
        System.out.print("\033\143"); // For Linux
        // ---- or ----
        // https://stackoverflow.com/questions/2979383/how-to-clear-the-console
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        // ---- or ---
        // processBuilder.command("clear");
        // processBuilder.start();
      }
    } catch (final Exception e) {
      // e.printStackTrace();
      // System.exit(0);
    }
  }

  /**
   * Get float value from user input
   *
   * @return float
   */
  public static float inFloat() {
    while (true) {
      try {
        return Float.parseFloat(BasicInputs.inStr());
      } catch (Exception e) {
        // e.printStackTrace();
      }
    }
  }

  /**
   * Get integer vlaue from user input
   *
   * @return integer
   */
  public static int inInt() {
    while (true) {
      try {
        return Integer.parseInt(BasicInputs.inStr());
      } catch (Exception e) {
        // e.printStackTrace();
      }
    }
  }

  /**
   * Get character from user input
   *
   * @return char
   */
  public static char inChar() {
    String str;

    do {
      str = inStr();

      if (str == null) System.exit(0);

      str.trim();
    } while (str.isEmpty());

    return str.charAt(0);
  }

  /**
   * Get string from user input
   *
   * @return string
   */
  public static String inStr() {
    String str = null;
    try {
      /**
       * If one of the input doesn't work, you can select
       * another methods.
       *
       * Note: Uncomment the library/package first.
       */
      // -----------
      // For outside of an IDE.
      // str = String.valueOf(System.console().readLine());
      // ---- or ----
      // For others
      // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // str = String.valueOf(br.readLine());
      // ---- or ----
      while (scanner.hasNextLine()) {
        str = scanner.nextLine();
        return str;
      }
    } catch (Exception e) {
      e.printStackTrace();
      print("Something went wrong.");
      System.exit(0);
    }

    return str;
  }
}
