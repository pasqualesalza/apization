package com.stackoverflow.api;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * How to tackle daylight savings using TimeZone in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10546083">https://stackoverflow.com/a/10546083</a>
 */
public class APIzator10546083 {

  public static Calendar tackleSaving() throws Exception {
    return Calendar.getInstance(TimeZone.getTimeZone("EST"));
  }
}
