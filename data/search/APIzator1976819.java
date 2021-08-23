package com.stackoverflow.api;

import java.math.BigDecimal;

/**
 * Are there any functions for truncating a double in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1976819">https://stackoverflow.com/a/1976819</a>
 */
public class APIzator1976819 {

  public static double round(double d, int decimalPlace) {
    BigDecimal bd = new BigDecimal(d);
    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
    return bd.doubleValue();
  }
}
