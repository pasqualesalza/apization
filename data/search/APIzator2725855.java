package com.stackoverflow.api;

/**
 * How to see if an object is an array without using reflection?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2725855">https://stackoverflow.com/a/2725855</a>
 */
public class APIzator2725855 {

  public static boolean isArray(Object obj) {
    return obj != null && obj.getClass().isArray();
  }
}
