package com.stackoverflow.api;

/**
 * How to match letters only using java regex, matches method?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7866352">https://stackoverflow.com/a/7866352</a>
 */
public class APIzator7866352 {

  public static boolean method() throws Exception {
    System.out.println("abc".matches("abc\\.?"));
    System.out.println("abc.".matches("abc\\.?"));
    System.out.println("abc..".matches("abc\\.?"));
    System.out.println("abc.".matches("[a-zA-Z]+\\.?"));
    return "abc.".matches("\\w+\\.?");
  }
}
