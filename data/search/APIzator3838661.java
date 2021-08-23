package com.stackoverflow.api;

import java.util.Calendar;

/**
 * Android/Java - Date Difference in days
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3838661">https://stackoverflow.com/a/3838661</a>
 */
public class APIzator3838661 {

  public static long difference() throws Exception {
    Calendar thatDay = Calendar.getInstance();
    thatDay.set(Calendar.DAY_OF_MONTH, 25);
    // 0-11 so 1 less
    thatDay.set(Calendar.MONTH, 7);
    thatDay.set(Calendar.YEAR, 1985);
    Calendar today = Calendar.getInstance();
    // result in millis
    long diff = today.getTimeInMillis() - thatDay.getTimeInMillis();
    return diff / (24 * 60 * 60 * 1000);
  }
}
