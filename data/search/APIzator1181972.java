package com.stackoverflow.api;

/**
 * Java: Get last element after split
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1181972">https://stackoverflow.com/a/1181972</a>
 */
public class APIzator1181972 {

  public static String java(String one) throws Exception {
    String[] bits = one.split("-");
    return bits[bits.length - 1];
  }
}
