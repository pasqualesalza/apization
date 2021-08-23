package com.stackoverflow.api;

/**
 * Print in new line, java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4008248">https://stackoverflow.com/a/4008248</a>
 */
public class APIzator4008248 {

  public static void print() throws Exception {
    // This will retrieve line separator dependent on OS.
    String newLine = System.getProperty("line.separator");
    System.out.println("line 1" + newLine + "line2");
  }
}
