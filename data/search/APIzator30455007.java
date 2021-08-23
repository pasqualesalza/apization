package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.text.SimpleDateFormat;

/**
 * How to correctly create a date with a specific format?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/30455007">https://stackoverflow.com/a/30455007</a>
 */
public class APIzator30455007 {

  public static String createDate() throws Exception {
    Date date = new Date();
    return new SimpleDateFormat("yyyy-MM-dd").format(date);
  }
}
