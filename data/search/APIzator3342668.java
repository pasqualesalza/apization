package com.stackoverflow.api;

/**
 * I get exception when using Thread.sleep(x) or wait()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3342668">https://stackoverflow.com/a/3342668</a>
 */
public class APIzator3342668 {

  public static void getException() throws Exception {
    try {
      // 1000 milliseconds is one second.
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}
