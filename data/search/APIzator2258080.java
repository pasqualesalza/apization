package com.stackoverflow.api;

/**
 * java: run a function after a specific number of seconds
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2258080">https://stackoverflow.com/a/2258080</a>
 */
public class APIzator2258080 {

  public static void runFunction() throws Exception {
    new java.util.Timer()
    .schedule(
        new java.util.TimerTask() {
          @Override
          public void run() {
            // your code here
          }
        },
        5000
      );
  }
}
