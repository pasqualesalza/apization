package com.stackoverflow.api;

/**
 * How do I print a double value without scientific notation using Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16098086">https://stackoverflow.com/a/16098086</a>
 */
public class APIzator16098086 {

  public static void printValue(double dexp) throws Exception {
    System.out.printf("dexp: %f\n", dexp);
    System.out.printf("dexp: %.0f\n", dexp);
  }
}
