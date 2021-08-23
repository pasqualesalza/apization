package com.stackoverflow.api;

import java.util.Calendar;

/**
 * Getting current Year and Month resulting strange results
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10161805">https://stackoverflow.com/a/10161805</a>
 */
public class APIzator10161805 {

  public static int getYear() throws Exception {
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    return c.get(Calendar.MONTH);
  }
}
