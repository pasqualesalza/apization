package com.stackoverflow.api;

/**
 * How to nicely format floating numbers to String without unnecessary decimal 0?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14126736">https://stackoverflow.com/a/14126736</a>
 */
public class APIzator14126736 {

  public static String fmt(double d) {
    if (d == (long) d) return String.format(
      "%d",
      (long) d
    ); else return String.format("%s", d);
  }
}
