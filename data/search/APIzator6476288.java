package com.stackoverflow.api;

import java.util.Calendar;

/**
 * How to get the number of milliseconds elapsed so far today
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6476288">https://stackoverflow.com/a/6476288</a>
 */
public class APIzator6476288 {

  public static String get() throws Exception {
    Calendar rightNow = Calendar.getInstance();
    // offset to add since we're not UTC
    long offset =
      rightNow.get(Calendar.ZONE_OFFSET) + rightNow.get(Calendar.DST_OFFSET);
    long sinceMidnight =
      (rightNow.getTimeInMillis() + offset) % (24 * 60 * 60 * 1000);
    return sinceMidnight + " milliseconds since midnight";
  }
}
