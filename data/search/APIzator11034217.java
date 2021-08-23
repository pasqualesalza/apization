package com.stackoverflow.api;

/**
 * How to check if I have reached the end of a String in Java ?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11034217">https://stackoverflow.com/a/11034217</a>
 */
public class APIzator11034217 {

  public static void check(String myString) throws Exception {
    for (char c : myString.toCharArray()) {
      System.out.println("Characer is " + c);
    }
    for (int i = 0; i < myString.length(); i++) {
      System.out.println("Character is " + myString.charAt(i));
    }
  }
}
