package com.stackoverflow.api;

import java.io.UnsupportedEncodingException;

/**
 * Check if a String is valid UTF-8 encoded in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6622288">https://stackoverflow.com/a/6622288</a>
 */
public class APIzator6622288 {

  public static void check(String myString) throws Exception {
    System.out.println(myString);
    byte[] myBytes = null;
    try {
      myBytes = myString.getBytes("UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
      System.exit(-1);
    }
    for (int i = 0; i < myBytes.length; i++) {
      System.out.println(myBytes[i]);
    }
  }
}
