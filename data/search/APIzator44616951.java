package com.stackoverflow.api;

/**
 * Java - Check Not Null/Empty else assign default value
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/44616951">https://stackoverflow.com/a/44616951</a>
 */
public class APIzator44616951 {

  public static <T> T getValueOrDefault(T value, T defaultValue) {
    return value == null ? defaultValue : value;
  }
}
