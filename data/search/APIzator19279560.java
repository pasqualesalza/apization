package com.stackoverflow.api;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * How do I use the new computeIfAbsent function?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19279560">https://stackoverflow.com/a/19279560</a>
 */
public class APIzator19279560 {

  public static void useFunction() {
    Map<String, Boolean> whoLetDogsOut = new ConcurrentHashMap<>();
    whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
    whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
  }

  static boolean f(String s) {
    System.out.println("creating a value for \"" + s + '"');
    return s.isEmpty();
  }
}
