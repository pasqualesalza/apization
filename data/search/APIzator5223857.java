package com.stackoverflow.api;

/**
 * How do I count the number of times a sequence occurs in a Java string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5223857">https://stackoverflow.com/a/5223857</a>
 */
public class APIzator5223857 {

  public static int countNumber(String input) throws Exception {
    int index = input.indexOf("is");
    int count = 0;
    while (index != -1) {
      count++;
      input = input.substring(index + 1);
      index = input.indexOf("is");
    }
    return count;
  }
}
