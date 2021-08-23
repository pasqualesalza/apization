package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * casting Arrays.asList causing exception: java.util.Arrays$ArrayList cannot be cast to java.util.ArrayList
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6641078">https://stackoverflow.com/a/6641078</a>
 */
public class APIzator6641078 {

  public static List<List<String>> cast() throws Exception {
    return new ArrayList<List<String>>();
  }
}
