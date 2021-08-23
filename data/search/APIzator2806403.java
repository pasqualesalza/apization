package com.stackoverflow.api;

import java.util.Calendar;

/**
 * Java program to get the current date without timestamp
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2806403">https://stackoverflow.com/a/2806403</a>
 */
public class APIzator2806403 {

  public static void program() throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.clear(Calendar.HOUR_OF_DAY);
    cal.clear(Calendar.AM_PM);
    cal.clear(Calendar.MINUTE);
    cal.clear(Calendar.SECOND);
    cal.clear(Calendar.MILLISECOND);
  }
}
