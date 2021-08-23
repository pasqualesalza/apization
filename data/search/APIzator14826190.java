package com.stackoverflow.api;

/**
 * String.replaceAll() is not working
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14826190">https://stackoverflow.com/a/14826190</a>
 */
public class APIzator14826190 {

  public static void work(String email) throws Exception {
    email = email.replaceAll("gmaii\\.com", "gmail.com");
  }
}
