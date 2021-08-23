package com.stackoverflow.api;

/**
 * Remove repeated characters in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19730642">https://stackoverflow.com/a/19730642</a>
 */
public class APIzator19730642 {

  public static void removeSpaces(String str) {
    String ourString = "";
    for (int i = 0; i < str.length() - 1; i++) {
      if (i == 0) {
        ourString = "" + str.charAt(i);
      } else {
        if (str.charAt(i - 1) != str.charAt(i)) {
          ourString = ourString + str.charAt(i);
        }
      }
    }
    System.out.println(ourString);
  }
}
