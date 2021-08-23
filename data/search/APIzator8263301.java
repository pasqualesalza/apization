package com.stackoverflow.api;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * how to find seconds since 1970 in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8263301">https://stackoverflow.com/a/8263301</a>
 */
public class APIzator8263301 {

  public static long findSecond() throws Exception {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.clear();
    calendar.set(2011, Calendar.OCTOBER, 1);
    return calendar.getTimeInMillis() / 1000L;
  }
}
