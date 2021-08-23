package com.stackoverflow.api;

/**
 * When do you use varargs in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/766564">https://stackoverflow.com/a/766564</a>
 */
public class APIzator766564 {

  public static void useVararg(int myInt, int myString)
    throws Exception {
    String.format("This is an integer: %d", myInt);
    String.format("This is an integer: %d and a string: %s", myInt, myString);
  }
}
