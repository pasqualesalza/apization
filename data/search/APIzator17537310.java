package com.stackoverflow.api;

import java.text.MessageFormat;

/**
 * Java: String formatting with placeholders
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17537310">https://stackoverflow.com/a/17537310</a>
 */
public class APIzator17537310 {

  public static String java(int y, int x) throws Exception {
    return MessageFormat.format("{0} + {1} = {2}", x, y, x + y);
  }
}
