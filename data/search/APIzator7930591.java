package com.stackoverflow.api;

import java.util.Calendar;

/**
 * Java calendar get the current date, without hours, minutes, seconds and milliseconds, in milliseconds
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7930591">https://stackoverflow.com/a/7930591</a>
 */
public class APIzator7930591 {

  public static void getDate(long currentDate) throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    currentDate = cal.getTimeInMillis();
  }
}
