package com.stackoverflow.api;

/**
 * When to use a Constructor and when to use getInstance() method (static factory methods)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3169644">https://stackoverflow.com/a/3169644</a>
 */
public class APIzator3169644 {

  public static Boolean valueOf(boolean b) {
    return b ? Boolean.TRUE : Boolean.FALSE;
  }
}
