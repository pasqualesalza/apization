package com.stackoverflow.api;

/**
 * "Possible loss of precision" in my Java program
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5603236">https://stackoverflow.com/a/5603236</a>
 */
public class APIzator5603236 {

  public static void loss(int x, int u, int t, double d, int a)
    throws Exception {
    d = ((u * t) + a * Math.pow(t, x)) / 2F;
    d = (float) ((u * t) + a * Math.pow(t, x)) / 2F;
  }
}
