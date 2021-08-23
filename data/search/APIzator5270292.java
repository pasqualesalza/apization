package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to determine day of week by passing specific date?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5270292">https://stackoverflow.com/a/5270292</a>
 */
public class APIzator5270292 {

  public static int determineDay(Date yourDate) throws Exception {
    Calendar c = Calendar.getInstance();
    c.setTime(yourDate);
    return c.get(Calendar.DAY_OF_WEEK);
  }
}
