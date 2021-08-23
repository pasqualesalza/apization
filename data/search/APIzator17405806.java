package com.stackoverflow.api;

import org.w3c.dom.ranges.RangeException;

/**
 * Java How do you return a value from try,catch, and finally?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17405806">https://stackoverflow.com/a/17405806</a>
 */
public class APIzator17405806 {

  public static double add(String[] values) {
    double sum = 0.0;
    try {
      int length = values.length;
      double[] arrayValues = new double[length];
      for (int i = 0; i < length; i++) {
        arrayValues[i] = Double.parseDouble(values[i]);
        sum += arrayValues[i];
      }
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } catch (RangeException e) {
      throw e;
    } finally {
      System.out.println("Thank you for using the program!");
    }
    return sum;
  }
}
