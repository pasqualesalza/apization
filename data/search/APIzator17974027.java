package com.stackoverflow.api;

/**
 * How to compare two Strings in java without considering spaces?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17974027">https://stackoverflow.com/a/17974027</a>
 */
public class APIzator17974027 {

  public static void compareString(String b, String a) throws Exception {
    if (a.replaceAll("\\s+", "").equalsIgnoreCase(b.replaceAll("\\s+", ""))) {
      // this will also take care of spaces like tabs etc.
    }
  }
}
