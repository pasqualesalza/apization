package com.stackoverflow.api;

/**
 * Quick Java String/toString Printing one char on each line
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9121309">https://stackoverflow.com/a/9121309</a>
 */
public class APIzator9121309 {

  public static void printingChar(String s) throws Exception {
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
    }
  }
}
