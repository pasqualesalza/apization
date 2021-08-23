package com.stackoverflow.api;

/**
 * Why does replaceAll fail with "illegal group reference"?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11913767">https://stackoverflow.com/a/11913767</a>
 */
public class APIzator11913767 {

  public static void fail(String s) throws Exception {
    s = s.replaceAll("\\s+\\$\\$", "\\$\\$");
    // or
    // s=s.replaceAll("\\s+\\Q$$\\E","\\$\\$");
  }
}
