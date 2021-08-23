package com.stackoverflow.api;

/**
 * Cast a Null String into Integer
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9596018">https://stackoverflow.com/a/9596018</a>
 */
public class APIzator9596018 {

  public static void castString(String str) throws Exception {
    // suppose str becomes null after some operation(s).
    int number = 0;
    try {
      if (str != null) number = Integer.parseInt(str);
    } catch (NumberFormatException e) {
      number = 0;
    }
  }
}
