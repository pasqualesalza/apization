package com.stackoverflow.api;

/**
 * Java "params" in method signature?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/519756">https://stackoverflow.com/a/519756</a>
 */
public class APIzator519756 {

  public static void foo(Object... bar) {
    for (Object baz : bar) {
      System.out.println(baz.toString());
    }
  }
}
