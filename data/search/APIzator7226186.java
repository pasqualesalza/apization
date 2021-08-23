package com.stackoverflow.api;

import java.util.Calendar;

/**
 * How to get day of the month?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7226186">https://stackoverflow.com/a/7226186</a>
 */
public class APIzator7226186 {

  public static String getDay() throws Exception {
    Calendar cal = Calendar.getInstance();
    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
    return String.valueOf(dayOfMonth);
  }
}
