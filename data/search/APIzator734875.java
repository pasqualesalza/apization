package com.stackoverflow.api;

import java.util.HashMap;

/**
 * NullPointerException while using put method of HashMap
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/734875">https://stackoverflow.com/a/734875</a>
 */
public class APIzator734875 {

  public static HashMap<String, String> nullpointerexception()
    throws Exception {
    return new HashMap<String, String>();
  }
}
