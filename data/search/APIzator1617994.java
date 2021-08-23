package com.stackoverflow.api;

/**
 * Setting priority to Java's threads
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1617994">https://stackoverflow.com/a/1617994</a>
 */
public class APIzator1617994 {

  public static void setPriority() {
    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    // Your main code.
  }
}
