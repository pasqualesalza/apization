package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to convert a date String to a Date or Calendar object?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/43807">https://stackoverflow.com/a/43807</a>
 */
public class APIzator43807 {

  public static void object(Date date) throws Exception {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
  }
}
