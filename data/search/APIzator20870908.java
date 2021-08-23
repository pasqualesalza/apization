package com.stackoverflow.api;

import java.util.HashSet;
import java.util.Set;

/**
 * Why set is not allowed duplicate value, which kind of mechanism used behind them?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20870908">https://stackoverflow.com/a/20870908</a>
 */
public class APIzator20870908 {

  public static boolean allowValue() throws Exception {
    Set<String> testSet = new HashSet<String>();
    boolean first = testSet.add("hello");
    // Prints "true"
    System.out.println(first);
    boolean second = testSet.add("hello");
    return second;
  }
}
