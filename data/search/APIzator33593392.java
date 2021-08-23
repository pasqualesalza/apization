package com.stackoverflow.api;

import java.util.HashSet;
import java.util.Set;

/**
 * How to convert hash Set into array using toArray() if the method toArray is not specified?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/33593392">https://stackoverflow.com/a/33593392</a>
 */
public class APIzator33593392 {

  public static Integer[] convertSet(Set<Integer> x) throws Exception {
    return x.toArray(new Integer[x.size()]);
  }
}
