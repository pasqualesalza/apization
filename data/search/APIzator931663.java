package com.stackoverflow.api;

/**
 * How do I launch a completely independent process from a Java program?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/931663">https://stackoverflow.com/a/931663</a>
 */
public class APIzator931663 {

  /**
   * @param args the command line arguments
   */
  public static void launchProcess(String str1) throws Exception {
    Runtime.getRuntime().exec(str1);
  }
}
