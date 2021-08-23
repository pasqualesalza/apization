package com.stackoverflow.api;

/**
 * When should we use intern method of String on String literals
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1855183">https://stackoverflow.com/a/1855183</a>
 */
public class APIzator1855183 {

  public static void useMethod(String s1, String s2) throws Exception {
    String s3 = "Rakesh".intern();
    String s4 = new String("Rakesh");
    String s5 = new String("Rakesh").intern();
    if (s1 == s2) {
      // 1.
      System.out.println("s1 and s2 are same");
    }
    if (s1 == s3) {
      // 2.
      System.out.println("s1 and s3 are same");
    }
    if (s1 == s4) {
      // 3.
      System.out.println("s1 and s4 are same");
    }
    if (s1 == s5) {
      // 4.
      System.out.println("s1 and s5 are same");
    }
  }
}
