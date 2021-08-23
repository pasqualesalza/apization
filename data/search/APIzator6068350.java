package com.stackoverflow.api;

/**
 * Convert ascii to int?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6068350">https://stackoverflow.com/a/6068350</a>
 */
public class APIzator6068350 {

  public static int convertAscii(int asciiValue) throws Exception {
    int numericValue = Character.getNumericValue(asciiValue);
    return numericValue;
  }
}
