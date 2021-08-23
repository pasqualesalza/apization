package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.protobuf.Duration;

/**
 * How to format a duration in java? (e.g format H:MM:SS)
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/266846">https://stackoverflow.com/a/266846</a>
 */
public class APIzator266846 {

  public static String formatDuration(Duration duration) {
    long seconds = duration.getSeconds();
    long absSeconds = Math.abs(seconds);
    String positive = String.format(
      "%d:%02d:%02d",
      absSeconds / 3600,
      (absSeconds % 3600) / 60,
      absSeconds % 60
    );
    return seconds < 0 ? "-" + positive : positive;
  }
}
