package com.stackoverflow.api;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * How to read input with multiple lines in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2297629">https://stackoverflow.com/a/2297629</a>
 */
public class APIzator2297629 {

  public static void readInput() {
    Scanner stdin = new Scanner(new BufferedInputStream(System.in));
    while (stdin.hasNext()) {
      System.out.println(Math.abs(stdin.nextLong() - stdin.nextLong()));
    }
  }
}
