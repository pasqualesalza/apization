package com.stackoverflow.api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Java 8 Convert given time and time zone to UTC time
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/34605826">https://stackoverflow.com/a/34605826</a>
 */
public class APIzator34605826 {

  public static ZonedDateTime giveTime(String str) throws Exception {
    ZoneId australia = ZoneId.of("Australia/Sydney");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
      "yyyy-MM-dd HH:mm"
    );
    LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
    ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(
      localtDateAndTime,
      australia
    );
    System.out.println(
      "Current date and time in a particular timezone : " + dateAndTimeInSydney
    );
    ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(
      ZoneOffset.UTC
    );
    return utcDate;
  }
}
