package com.stackoverflow.api;

/**
 * char array to int array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10886217">https://stackoverflow.com/a/10886217</a>
 */
public class APIzator10886217 {

  public static void array(String raw) throws Exception {
    int[] num = new int[raw.length()];
    for (int i = 0; i < raw.length(); i++) {}
    for (int i : num) {
      System.out.println(i);
    }
  }
}
