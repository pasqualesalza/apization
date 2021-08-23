package com.stackoverflow.api;

/**
 * Java String - See if a string contains only numbers and not letters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10575676">https://stackoverflow.com/a/10575676</a>
 */
public class APIzator10575676 {

  public static void see(String text) throws Exception {
    if (text.contains("[a-zA-Z]+") == false && text.length() > 2) {}
    if (text.matches("[0-9]+") && text.length() > 2) {}
  }
}
