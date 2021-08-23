package com.stackoverflow.api;

/**
 * How to convert minutes to Hours and minutes (hh:mm) in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5387398">https://stackoverflow.com/a/5387398</a>
 */
public class APIzator5387398 {

  public static void convertMinute(int t) throws Exception {
    // since both are ints, you get an int
    int hours = t / 60;
    int minutes = t % 60;
    System.out.printf("%d:%02d", hours, minutes);
  }
}
