package com.stackoverflow.api;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * How to check if user input is not an int value
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18119273">https://stackoverflow.com/a/18119273</a>
 */
public class APIzator18119273 {

  public static void check() throws Exception {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Please input an integer");
      // nextInt will throw InputMismatchException
      // if the next token does not match the Integer
      // regular expression, or is out of range
      int usrInput = sc.nextInt();
    } catch (InputMismatchException exception) {
      // Print "This is not an integer"
      // when user put other than integer
      System.out.println("This is not an integer");
    }
  }
}
