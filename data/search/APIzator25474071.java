package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * Getting hours,minutes, and seconds from Date?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/25474071">https://stackoverflow.com/a/25474071</a>
 */
public class APIzator25474071 {

  public static int getHour(Date date) throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    return cal.get(Calendar.HOUR_OF_DAY);
  }
}
