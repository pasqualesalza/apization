package com.stackoverflow.api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * How to get milliseconds from LocalDateTime in Java 8
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23945792">https://stackoverflow.com/a/23945792</a>
 */
public class APIzator23945792 {

  public static long getMillisecond() throws Exception {
    LocalDateTime ldt = LocalDateTime.of(2014, 5, 29, 18, 41, 16);
    ZonedDateTime zdt = ldt.atZone(ZoneId.of("America/Los_Angeles"));
    return zdt.toInstant().toEpochMilli();
  }
}
