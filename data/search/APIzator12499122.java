package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to generate a Date from just Month and Year in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12499122">https://stackoverflow.com/a/12499122</a>
 */
public class APIzator12499122 {

  public static Date generateDate(int year, int month) throws Exception {
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.MONTH, month);
    calendar.set(Calendar.YEAR, year);
    return calendar.getTime();
  }
}
