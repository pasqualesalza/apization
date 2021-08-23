package com.stackoverflow.api;

import java.util.concurrent.TimeUnit;

/**
 * How to convert Milliseconds to "X mins, x seconds" in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/625624">https://stackoverflow.com/a/625624</a>
 */
public class APIzator625624 {

  public static void convertMillisecond(int millis, int milliseconds)
    throws Exception {
    String.format(
      "%d min, %d sec",
      TimeUnit.MILLISECONDS.toMinutes(millis),
      TimeUnit.MILLISECONDS.toSeconds(millis) -
      TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
    );
    String.format(
      "%02d min, %02d sec",
      TimeUnit.MILLISECONDS.toMinutes(millis),
      TimeUnit.MILLISECONDS.toSeconds(millis) -
      TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
    );
    int seconds = (int) (milliseconds / 1000) % 60;
    int minutes = (int) ((milliseconds / (1000 * 60)) % 60);
    int hours = (int) ((milliseconds / (1000 * 60 * 60)) % 24);
    // etc...
  }
}
