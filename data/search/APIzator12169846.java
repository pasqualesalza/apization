package com.stackoverflow.api;

/**
 * Android: String format with Double value
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12169846">https://stackoverflow.com/a/12169846</a>
 */
public class APIzator12169846 {

  public static String android(int dWeightInLbs, int dWeightInKg)
    throws Exception {
    return String.format("%.0f kg / %.0f lbs", dWeightInKg, dWeightInLbs);
  }
}
