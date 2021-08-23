package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.DateTimeZone;

/**
 * JodaTime - how to get current time in UTC
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27741378">https://stackoverflow.com/a/27741378</a>
 */
public class APIzator27741378 {

  public static DateTime getTime() throws Exception {
    return new DateTime(DateTimeZone.UTC);
  }
}
