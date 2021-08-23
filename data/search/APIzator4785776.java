package com.stackoverflow.api;

/**
 * Convert a String of Hex into ASCII in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4785776">https://stackoverflow.com/a/4785776</a>
 */
public class APIzator4785776 {

  public static StringBuilder convertString(String hex) {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < hex.length(); i += 2) {
      String str = hex.substring(i, i + 2);
      output.append((char) Integer.parseInt(str, 16));
    }
    return output;
  }
}
