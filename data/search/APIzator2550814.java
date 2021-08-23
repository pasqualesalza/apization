package com.stackoverflow.api;

import java.util.concurrent.TimeUnit;

/**
 * Java loop for a certain duration
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2550814">https://stackoverflow.com/a/2550814</a>
 */
public class APIzator2550814 {

  public static void loop() throws Exception {
    for (
      long stop = System.nanoTime() + TimeUnit.SECONDS.toNanos(2);
      stop > System.nanoTime();
    ) {
      /*
       * Hammer the JVM with junk
       */
    }
  }
}
