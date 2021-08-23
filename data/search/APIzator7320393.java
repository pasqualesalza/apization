package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Scanner;

/**
 * How to test for blank line with Java Scanner?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7320393">https://stackoverflow.com/a/7320393</a>
 */
public class APIzator7320393 {

  public static void test() throws Exception {
    Scanner keyboard = new Scanner(System.in);
    String line = null;
    while (!(line = keyboard.nextLine()).isEmpty()) {
      String[] values = line.split("\\s+");
      System.out.print("entered: " + Arrays.toString(values) + "\n");
    }
    System.out.print("Bye!");
  }
}
