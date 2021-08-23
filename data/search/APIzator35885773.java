package com.stackoverflow.api;

import java.time.ZonedDateTime;

/**
 * java.time.format.DateTimeParseException: Text could not be parsed at index 21
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/35885773">https://stackoverflow.com/a/35885773</a>
 */
public class APIzator35885773 {

  public static ZonedDateTime javatimeformat(String dateTime)
    throws Exception {
    return ZonedDateTime.parse(dateTime);
  }
}
