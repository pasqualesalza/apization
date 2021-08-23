package com.stackoverflow.api;

/**
 * How can I pad an integer with zeros on the left?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/473309">https://stackoverflow.com/a/473309</a>
 */
public class APIzator473309 {

  public static void padInteger(int yournumber) throws Exception {
    String.format("%05d", yournumber);
  }
}
