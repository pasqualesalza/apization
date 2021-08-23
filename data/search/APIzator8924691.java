package com.stackoverflow.api;

/**
 * how to count the exact number of words in a string that has empty spaces between words?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8924691">https://stackoverflow.com/a/8924691</a>
 */
public class APIzator8924691 {

  public static int countNumber(String text) throws Exception {
    String trimmed = text.trim();
    return trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
  }
}
