package com.stackoverflow.api;

/**
 * How to remove milliseconds from a timestamp?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9638396">https://stackoverflow.com/a/9638396</a>
 */
public class APIzator9638396 {

  public static long removeMillisecond(long yourmilliseconds)
    throws Exception {
    long droppedMillis = 1000 * (yourmilliseconds / 1000);
    return droppedMillis;
  }
}
