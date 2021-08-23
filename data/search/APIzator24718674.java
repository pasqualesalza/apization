package com.stackoverflow.api;

/**
 * To check if string contains particular word
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24718674">https://stackoverflow.com/a/24718674</a>
 */
public class APIzator24718674 {

  public static void check(String sentence, String search)
    throws Exception {
    if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {
      System.out.println("I found the keyword");
    } else {
      System.out.println("not found");
    }
  }
}
