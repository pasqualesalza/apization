package com.stackoverflow.api;

import java.math.BigDecimal;

/**
 * How to round 0.745 to 0.75 using BigDecimal.ROUND_HALF_UP?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12460596">https://stackoverflow.com/a/12460596</a>
 */
public class APIzator12460596 {

  public static BigDecimal round(String doubleVal, String doubleVal1) {
    BigDecimal bdTest = new BigDecimal(doubleVal);
    BigDecimal bdTest1 = new BigDecimal(doubleVal1);
    bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);
    bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
    // 1.75
    System.out.println("bdTest:" + bdTest);
    return bdTest1;
  }
}
