package com.stackoverflow.api;

/**
 * Splitting string with pipe character ("|")
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21524670">https://stackoverflow.com/a/21524670</a>
 */
public class APIzator21524670 {

  public static String[] splittingString(String rat_values)
    throws Exception {
    return rat_values.split("\\|");
  }
}
