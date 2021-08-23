package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;

/**
 * A quick and easy way to join array elements with a separator (the opposite of split) in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/26195047">https://stackoverflow.com/a/26195047</a>
 */
public class APIzator26195047 {

  public static String way(String elements, String delimiter, String[] array)
    throws Exception {
    String.join(delimiter, elements);
    String joined1 = String.join(",", "a", "b", "c");
    String joined2 = String.join(",", array);
    List<String> list = Arrays.asList(array);
    return String.join(",", list);
  }
}
