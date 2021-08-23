package com.stackoverflow.api;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * BigDecimal setScale and round
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13461270">https://stackoverflow.com/a/13461270</a>
 */
public class APIzator13461270 {

  public static void setscale() throws Exception {
    // 1.
    new BigDecimal("35.3456").round(new MathContext(4, RoundingMode.HALF_UP));
    // result = 35.35
    // 2.
    new BigDecimal("35.3456").setScale(4, RoundingMode.HALF_UP);
    // result = 35.3456
  }
}
