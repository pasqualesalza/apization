package com.stackoverflow.api;

import java.text.DecimalFormat;

/**
 * Save an integer in two digit format in a variable in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11852121">https://stackoverflow.com/a/11852121</a>
 */
public class APIzator11852121 {

  public static String saveInteger(int a) throws Exception {
    return new DecimalFormat("00").format(a);
  }
}
