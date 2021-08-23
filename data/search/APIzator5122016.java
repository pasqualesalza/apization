package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.text.SimpleDateFormat;

/**
 * Is there a date format to display the day of the week in java?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5122016">https://stackoverflow.com/a/5122016</a>
 */
public class APIzator5122016 {

  public static void be() throws Exception {
    new SimpleDateFormat("EEE").format(new Date());
    new SimpleDateFormat("EEEE").format(new Date());
    new SimpleDateFormat("EEEEE").format(new Date());
    new SimpleDateFormat("yyyy-MM-EEE").format(new Date());
  }
}
