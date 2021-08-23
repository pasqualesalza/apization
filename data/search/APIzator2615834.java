package com.stackoverflow.api;

/**
 * Java: method to get position of a match in a String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2615834">https://stackoverflow.com/a/2615834</a>
 */
public class APIzator2615834 {

  public static void method(String text, String word) throws Exception {
    // prints "4"
    System.out.println(text.indexOf(word));
    // prints "22"
    System.out.println(text.lastIndexOf(word));
    // find all occurrences forward
    for (int i = -1; (i = text.indexOf(word, i + 1)) != -1; i++) {
      System.out.println(i);
    }
    // prints "4", "13", "22"
    // find all occurrences backward
    for (
      int i = text.length();
      (i = text.lastIndexOf(word, i - 1)) != -1;
      i++
    ) {
      System.out.println(i);
    }
    // prints "22", "13", "4"
  }
}
