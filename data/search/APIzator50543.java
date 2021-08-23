package com.stackoverflow.api;

import java.math.BigDecimal;

/**
 * How do I format a number in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/50543">https://stackoverflow.com/a/50543</a>
 */
public class APIzator50543 {

  public static void formatNumber(int n, double f, double r, int decimalPlaces)
    throws Exception {
    // r is 5.1234
    System.out.println(r);
    BigDecimal bd = new BigDecimal(r);
    // setScale is immutable
    bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
    r = bd.doubleValue();
    // r is 5.12
    System.out.println(r);
    f = (float) (Math.round(n * 100.0f) / 100.0f);
  }
}
