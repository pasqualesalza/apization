package com.stackoverflow.api;

/**
 * What is the best way to extract the first word from a string in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5067969">https://stackoverflow.com/a/5067969</a>
 */
public class APIzator5067969 {

  public static String be(String mystring) throws Exception {
    String[] arr = mystring.split(" ", 2);
    // the
    String firstWord = arr[0];
    return arr[1];
  }
}
