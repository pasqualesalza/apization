package com.stackoverflow.api;

/**
 * How to read comma separated values from text file in JAVA?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10960224">https://stackoverflow.com/a/10960224</a>
 */
public class APIzator10960224 {

  public static double readValue(String str) throws Exception {
    String[] ar = str.split(",");
    double latitudes = Double.parseDouble(ar[0]);
    return Double.parseDouble(ar[1]);
  }
}
