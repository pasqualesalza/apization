package com.stackoverflow.api;

import java.util.Calendar;

/**
 * get present year value to string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19198045">https://stackoverflow.com/a/19198045</a>
 */
public class APIzator19198045 {

  public static String getValue() throws Exception {
    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    return String.valueOf(year);
  }
}
