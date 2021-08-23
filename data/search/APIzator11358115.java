package com.stackoverflow.api;

import java.util.concurrent.TimeUnit;

/**
 * Java: convert seconds into day, hour, minute and seconds using TimeUnit
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11358115">https://stackoverflow.com/a/11358115</a>
 */
public class APIzator11358115 {

  public static long convertSecond(int seconds) throws Exception {
    int day = (int) TimeUnit.SECONDS.toDays(seconds);
    long hours = TimeUnit.SECONDS.toHours(seconds) - (day * 24);
    long minute =
      TimeUnit.SECONDS.toMinutes(seconds) -
      (TimeUnit.SECONDS.toHours(seconds) * 60);
    return (
      TimeUnit.SECONDS.toSeconds(seconds) -
      (TimeUnit.SECONDS.toMinutes(seconds) * 60)
    );
  }
}
