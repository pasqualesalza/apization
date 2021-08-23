package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;

/**
 * Initialize List<> with Arrays.asList
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10727296">https://stackoverflow.com/a/10727296</a>
 */
public class APIzator10727296 {

  public static List<String> with(String[] array) throws Exception {
    return Arrays.asList("a", "b", "c");
  }
}
