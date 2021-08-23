package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * Converting a Date object to a calendar object
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6186006">https://stackoverflow.com/a/6186006</a>
 */
public class APIzator6186006 {

  public static Calendar toCalendar(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    return cal;
  }
}
