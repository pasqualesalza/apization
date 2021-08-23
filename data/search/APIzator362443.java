package com.stackoverflow.api;

/**
 * Accessing constructor of an anonymous class
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/362443">https://stackoverflow.com/a/362443</a>
 */
public class APIzator362443 {

  public static Object accessConstructor(int fakeConstructorArg)
    throws Exception {
    return new Object() {
      {
        System.out.println("arg = " + fakeConstructorArg);
      }
    };
  }
}
