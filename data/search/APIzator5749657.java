package com.stackoverflow.api;

/**
 * losing precision converting from java BigDecimal to double
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5749657">https://stackoverflow.com/a/5749657</a>
 */
public class APIzator5749657 {

  public static double losePrecision() throws Exception {
    System.out.println(Double.parseDouble("299792.4579999984"));
    System.out.println(Double.parseDouble("299792.45799999984"));
    System.out.println(Double.parseDouble("299792.457999999984"));
    return Double.parseDouble("299792.457999999924");
  }
}
