package com.stackoverflow.api;

/**
 * set double format with 2 decimal places
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17082262">https://stackoverflow.com/a/17082262</a>
 */
public class APIzator17082262 {

  public static void setFormat(double getminutes, double compute)
    throws Exception {
    compute = (Double) getminutes / 60;
  }
}
