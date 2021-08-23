package com.stackoverflow.api;

/**
 * Good way to encapsulate Integer.parseInt()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1486082">https://stackoverflow.com/a/1486082</a>
 */
public class APIzator1486082 {

  public static Integer tryParse(String text) {
    try {
      return Integer.parseInt(text);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
