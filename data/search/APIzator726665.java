package com.stackoverflow.api;

/**
 * Creating a "logical exclusive or" operator in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/726665">https://stackoverflow.com/a/726665</a>
 */
public class APIzator726665 {

  public static void createOperator(boolean[] all) {
    for (boolean a : all) {
      for (boolean b : all) {
        boolean c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);
      }
    }
  }
}
