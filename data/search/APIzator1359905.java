package com.stackoverflow.api;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Using BigDecimal to work with currencies
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1359905">https://stackoverflow.com/a/1359905</a>
 */
public class APIzator1359905 {

  public static BigDecimal useBigdecimal() throws Exception {
    BigDecimal modelVal = new BigDecimal("24.455");
    return modelVal.setScale(2, RoundingMode.HALF_EVEN);
  }
}
