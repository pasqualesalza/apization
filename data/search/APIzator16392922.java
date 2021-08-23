package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to reduce one month from current date and stored in date variable using java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16392922">https://stackoverflow.com/a/16392922</a>
 */
public class APIzator16392922 {

  public static Date reduceMonth() throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.MONTH, -1);
    return cal.getTime();
  }
}
