package com.stackoverflow.api;

import java.math.BigDecimal;

/**
 * Rounding Bigdecimal values with 2 Decimal Places
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22610642">https://stackoverflow.com/a/22610642</a>
 */
public class APIzator22610642 {

  public static BigDecimal roundValue() throws Exception {
    BigDecimal a = new BigDecimal("10.12345");
    BigDecimal b = new BigDecimal("10.12556");
    a = a.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    b = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    System.out.println(a);
    return b;
  }
}
