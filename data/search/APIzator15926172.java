package com.stackoverflow.api;

/**
 * How make JUnit to print asserts and results
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15926172">https://stackoverflow.com/a/15926172</a>
 */
public class APIzator15926172 {

  public static void assertNotNull(String description, Object object) {
    try {
      assertNotNull(description, object);
      System.out.println(description + " - passed");
    } catch (AssertionError e) {
      System.out.println(description + " - failed");
      throw e;
    }
  }
}
