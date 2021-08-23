package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Creating a GregorianCalendar instance from milliseconds
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4450393">https://stackoverflow.com/a/4450393</a>
 */
public class APIzator4450393 {

  public static void createInstance(Date timestamp) throws Exception {
    Calendar cal = GregorianCalendar.getInstance();
    cal.setTime(timestamp);
  }
}
