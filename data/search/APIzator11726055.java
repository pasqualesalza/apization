package com.stackoverflow.api;

/**
 * Split string into individual words Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11726055">https://stackoverflow.com/a/11726055</a>
 */
public class APIzator11726055 {

  public static void string(String s) throws Exception {
    String[] arr = s.split(" ");
    for (String ss : arr) {
      System.out.println(ss);
    }
  }
}
