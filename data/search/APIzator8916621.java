package com.stackoverflow.api;

/**
 * Convert integer minutes into String "hh:mm"
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8916621">https://stackoverflow.com/a/8916621</a>
 */
public class APIzator8916621 {

  public static String convertMinute(String startTime, int minutes)
    throws Exception {
    int h = minutes / 60 + Integer.parseInt(startTime.substring(0, 1));
    int m = minutes % 60 + Integer.parseInt(startTime.substring(3, 4));
    return h + ":" + m;
  }
}
