package com.stackoverflow.api;

/**
 * Any simpler way to get the last element of a Java array?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15317037">https://stackoverflow.com/a/15317037</a>
 */
public class APIzator15317037 {

  public static String way(String sentance) throws Exception {
    return sentance.replaceAll(".* ", "");
  }
}
