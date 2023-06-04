package com.app;

import java.util.Scanner;

public class Utils {

  public static Scanner scanner = new Scanner(System.in);

  public static String inStr() {
    return scanner.nextLine();
  }

  public static void close() {
    scanner.close();
  }
}
