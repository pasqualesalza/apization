package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * Java Date cut off time information
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1908419">https://stackoverflow.com/a/1908419</a>
 */
public class APIzator1908419 {

  public static long cut(Date dateObject) throws Exception {
    // locale-specific
    Calendar cal = Calendar.getInstance();
    cal.setTime(dateObject);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTimeInMillis();
  }
}
