package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How do I say 5 seconds from now in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1655450">https://stackoverflow.com/a/1655450</a>
 */
public class APIzator1655450 {

  public static Date saySecond() throws Exception {
    // gets a calendar using the default time zone and locale.
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.SECOND, 5);
    return calendar.getTime();
  }
}
