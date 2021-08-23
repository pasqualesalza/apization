package com.stackoverflow.api;

import java.util.Date;
import java.util.TimeZone;

/**
 * What is the default timezone in java.util.Date
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11357789">https://stackoverflow.com/a/11357789</a>
 */
public class APIzator11357789 {

  public static Date be() throws Exception {
    Date date = new Date();
    System.out.println(TimeZone.getDefault());
    System.out.println(date);
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    System.out.println(TimeZone.getDefault());
    return date;
  }
}
