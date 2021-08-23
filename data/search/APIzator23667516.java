package com.stackoverflow.api;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * How to get boolean user input using scanner?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23667516">https://stackoverflow.com/a/23667516</a>
 */
public class APIzator23667516 {

  public static void get() throws Exception {
    boolean b = false;
    do {
      try {
        System.out.print("Are you above 18?");
        Scanner n = new Scanner(System.in);
        boolean bn = n.nextBoolean();
        if (bn == true) {
          System.out.println("Over 18");
        } else if (bn == false) {
          System.out.println("under 18");
        }
      } catch (InputMismatchException e) {
        System.out.println("Invalid input!");
      }
    } while (!b);
  }
}
