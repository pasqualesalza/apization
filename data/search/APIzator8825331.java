package com.stackoverflow.api;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * rounding decimal points
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8825331">https://stackoverflow.com/a/8825331</a>
 */
public class APIzator8825331 {

  public static BigDecimal roundPoint(double x) throws Exception {
    // => 1.23
    double y = Math.round(x * 100.0) / 100.0;
    BigDecimal a = new BigDecimal("1.234");
    return a.setScale(2, RoundingMode.DOWN);
  }
}
