package com.stackoverflow.api;

import java.util.Scanner;

/**
 * How can I get the user input in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5287561">https://stackoverflow.com/a/5287561</a>
 */
public class APIzator5287561 {

  public static void getInput() throws Exception {
    // Reading from System.in
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number: ");
    // Scans the next token of the input as an int.
    int n = reader.nextInt();
    // once finished
    reader.close();
  }
}
