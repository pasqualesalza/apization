package com.stackoverflow.api;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Convert double to BigDecimal and set BigDecimal Precision
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12395405">https://stackoverflow.com/a/12395405</a>
 */
public class APIzator12395405 {

  public static BigDecimal convert(int d) throws Exception {
    return new BigDecimal(d, MathContext.DECIMAL64);
  }
}
