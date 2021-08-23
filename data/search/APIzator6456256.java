package com.stackoverflow.api;

import android.net.ParseException;

/**
 * Java - checking if parseInt throws exception
 *
 * classpath: android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6456256">https://stackoverflow.com/a/6456256</a>
 */
public class APIzator6456256 {

  public static boolean isParsable(String input) {
    boolean parsable = true;
    try {
      Integer.parseInt(input);
    } catch (ParseException e) {
      parsable = false;
    }
    return parsable;
  }
}
