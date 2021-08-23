package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to sanity check a date in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/226920">https://stackoverflow.com/a/226920</a>
 */
public class APIzator226920 {

  public static void checkDate(Date yourDate) throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.setLenient(false);
    cal.setTime(yourDate);
    try {
      cal.getTime();
    } catch (Exception e) {
      System.out.println("Invalid date");
    }
  }
}
