package com.stackoverflow.api;

/**
 * Replacing illegal character in fileName
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15075907">https://stackoverflow.com/a/15075907</a>
 */
public class APIzator15075907 {

  public static void replaceCharacter(String myString) throws Exception {
    myString = myString.replaceAll("[^a-zA-Z0-9\\.\\-]", "_");
  }
}
