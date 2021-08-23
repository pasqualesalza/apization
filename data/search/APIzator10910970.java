package com.stackoverflow.api;

/**
 * How do shift operators work in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10910970">https://stackoverflow.com/a/10910970</a>
 */
public class APIzator10910970 {

  public static String work() throws Exception {
    System.out.println(Integer.toBinaryString(2 << 11));
    System.out.println(Integer.toBinaryString(2 << 22));
    return Integer.toBinaryString(2 << 33);
  }
}
