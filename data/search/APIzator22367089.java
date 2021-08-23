package com.stackoverflow.api;

/**
 * IntelliJ IDEA 13 debugger don't stop on breakpoint in java for maven project
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22367089">https://stackoverflow.com/a/22367089</a>
 */
public class APIzator22367089 {

  private static final String GREETING = System.getProperty("greeting", "Hi");

  public static String stop(int x) {
    return GREETING;
  }
}
