package com.stackoverflow.api;

import java.util.Arrays;

/**
 * How to initailize byte array of 100 bytes in java with all 0's
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16475547">https://stackoverflow.com/a/16475547</a>
 */
public class APIzator16475547 {

  public static void initailizeArray(byte[] bytes) throws Exception {
    Arrays.fill(bytes, (byte) 1);
  }
}
