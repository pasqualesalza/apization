package com.stackoverflow.api;

/**
 * Reverse each individual word of "Hello World" string with Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2441523">https://stackoverflow.com/a/2441523</a>
 */
public class APIzator2441523 {

  public static void reverseWord(String source) throws Exception {
    for (String part : source.split(" ")) {
      System.out.print(new StringBuilder(part).reverse().toString());
      System.out.print(" ");
    }
  }
}
