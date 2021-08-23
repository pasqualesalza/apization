package com.stackoverflow.api;

/**
 * how to get the minimum,maximum value of an array?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18828505">https://stackoverflow.com/a/18828505</a>
 */
public class APIzator18828505 {

  public static void getValue(int[] convertedValues) throws Exception {
    int max = convertedValues[0];
    for (int i = 1; i < convertedValues.length; i++) {
      if (convertedValues[i] > max) {
        max = convertedValues[i];
      }
    }
  }
}
