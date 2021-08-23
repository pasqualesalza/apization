package com.stackoverflow.api;

/**
 * Remove dash from a phone number
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2717431">https://stackoverflow.com/a/2717431</a>
 */
public class APIzator2717431 {

  public static void removeDash(String phoneNumber) throws Exception {
    phoneNumber.replaceAll("[\\s\\-()]", "");
    phoneNumber.replaceAll("\\D", "");
  }
}
