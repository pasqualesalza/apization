package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Immutable array in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3700995">https://stackoverflow.com/a/3700995</a>
 */
public class APIzator3700995 {

  public static List<Integer> array() throws Exception {
    return Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3));
  }
}
