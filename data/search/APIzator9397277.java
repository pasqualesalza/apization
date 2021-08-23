package com.stackoverflow.api;

import java.util.Calendar;

/**
 * last day of month calculation
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9397277">https://stackoverflow.com/a/9397277</a>
 */
public class APIzator9397277 {

  public static void day() throws Exception {
    Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
  }
}
