package com.stackoverflow.api;

/**
 * Validating IPv4 string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5240291">https://stackoverflow.com/a/5240291</a>
 */
public class APIzator5240291 {

  public static boolean validIP(String ip) {
    try {
      if (ip == null || ip.isEmpty()) {
        return false;
      }
      String[] parts = ip.split("\\.");
      if (parts.length != 4) {
        return false;
      }
      for (String s : parts) {
        int i = Integer.parseInt(s);
        if ((i < 0) || (i > 255)) {
          return false;
        }
      }
      if (ip.endsWith(".")) {
        return false;
      }
      return true;
    } catch (NumberFormatException nfe) {
      return false;
    }
  }
}
