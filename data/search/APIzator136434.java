package com.stackoverflow.api;

import java.util.Calendar;

/**
 * Get integer value of the current year in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/136434">https://stackoverflow.com/a/136434</a>
 */
public class APIzator136434 {

  public static int getValue() throws Exception {
    return Calendar.getInstance().get(Calendar.YEAR);
  }
}
