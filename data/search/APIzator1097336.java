package com.stackoverflow.api;

import java.math.BigDecimal;

/**
 * Convert a String to Double - Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1097336">https://stackoverflow.com/a/1097336</a>
 */
public class APIzator1097336 {

  public static BigDecimal convertString(String str) throws Exception {
    return new BigDecimal(str.replace(",", ""));
  }
}
