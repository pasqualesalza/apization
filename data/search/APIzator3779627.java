package com.stackoverflow.api;

/**
 * Why does dividing a float by an integer return 0.0?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3779627">https://stackoverflow.com/a/3779627</a>
 */
public class APIzator3779627 {

  public static double divideFloat(int n) throws Exception {
    return (n / 1024.0) * 255;
  }
}
