package com.stackoverflow.api;

/**
 * How to convert hex strings to byte values in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8652958">https://stackoverflow.com/a/8652958</a>
 */
public class APIzator8652958 {

  public static int convertString(int firstCharNumber, int secondCharNumber)
    throws Exception {
    return (firstCharNumber << 4) | secondCharNumber;
  }
}
