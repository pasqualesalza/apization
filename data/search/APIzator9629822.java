package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Get Today's date in Java at midnight time
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9629822">https://stackoverflow.com/a/9629822</a>
 */
public class APIzator9629822 {

  public static Date getDate() throws Exception {
    Calendar c = new GregorianCalendar();
    // anything 0 - 23
    c.set(Calendar.HOUR_OF_DAY, 0);
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);
    return c.getTime();
  }
}
