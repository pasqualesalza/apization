package com.stackoverflow.api;

import java.util.Calendar;

/**
 * Check if DAY_OF_WEEK is between Monday and Friday
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10118285">https://stackoverflow.com/a/10118285</a>
 */
public class APIzator10118285 {

  public static boolean check() throws Exception {
    // set this up however you need it.
    Calendar myDate = Calendar.getInstance();
    int dow = myDate.get(Calendar.DAY_OF_WEEK);
    return ((dow >= Calendar.MONDAY) && (dow <= Calendar.FRIDAY));
  }
}
