package com.stackoverflow.api;

/**
 * java split () method
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14956330">https://stackoverflow.com/a/14956330</a>
 */
public class APIzator14956330 {

  public static void split(String str2) throws Exception {
    String[] str1Array = str2.split(" ");
    for (char ch : str2.toCharArray()) {
      System.out.println(ch);
    }
  }
}
