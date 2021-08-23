package com.stackoverflow.api;

/**
 * Delete unused variable's memory in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11330884">https://stackoverflow.com/a/11330884</a>
 */
public class APIzator11330884 {

  public static void unusedMemory() throws Exception {
    Object obj = new Object();
    // use obj
    obj = null;
    System.gc();
  }
}
