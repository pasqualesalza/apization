package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to set time to a date object in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5165471">https://stackoverflow.com/a/5165471</a>
 */
public class APIzator5165471 {

  public static Date setTime() throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, 17);
    cal.set(Calendar.MINUTE, 30);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
  }
}
