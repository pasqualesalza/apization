package com.stackoverflow.api;

import java.text.MessageFormat;

/**
 * How to format strings in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6432100">https://stackoverflow.com/a/6432100</a>
 */
public class APIzator6432100 {

  public static void formatString() throws Exception {
    MessageFormat.format("String is \"{1}\", number is {0}.", 42, "foobar");
  }
}
