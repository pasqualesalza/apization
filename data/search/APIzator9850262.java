package com.stackoverflow.api;

/**
 * Java Regex - Using String's replaceAll method to replace newlines
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9850262">https://stackoverflow.com/a/9850262</a>
 */
public class APIzator9850262 {

  public static void method(String string) throws Exception {
    string = string.replace("\n", " --linebreak-- ");
  }
}
