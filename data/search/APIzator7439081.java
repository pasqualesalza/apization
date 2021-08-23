package com.stackoverflow.api;

/**
 * Set multiple system properties Java command line
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7439081">https://stackoverflow.com/a/7439081</a>
 */
public class APIzator7439081 {

  public static void setProperty() throws Exception {
    String line = System.getProperty("Arguments");
    if (line != null) {
      String[] str = line.split(",");
      for (int i = 1; i < str.length; i++) {
        String[] arr = str[i].split("=");
        System.out.println("Key = " + arr[0]);
        System.out.println("Value = " + arr[1]);
      }
    }
  }
}
