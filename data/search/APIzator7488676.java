package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;

/**
 * How to convert comma-separated String to ArrayList?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7488676">https://stackoverflow.com/a/7488676</a>
 */
public class APIzator7488676 {

  public static List<String> convertString(String str) throws Exception {
    return Arrays.asList(str.split("\\s*,\\s*"));
  }
}
