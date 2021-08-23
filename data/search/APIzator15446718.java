package com.stackoverflow.api;

import java.io.IOException;

/**
 * What is the use of System.in.read()?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15446718">https://stackoverflow.com/a/15446718</a>
 */
public class APIzator15446718 {

  public static void be() {
    int inChar;
    System.out.println("Enter a Character:");
    try {
      inChar = System.in.read();
      System.out.print("You entered ");
      System.out.println(inChar);
    } catch (IOException e) {
      System.out.println("Error reading from user");
    }
  }
}
