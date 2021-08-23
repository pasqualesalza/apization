package com.stackoverflow.api;

/**
 * How can I "intercept" Ctrl+C in a CLI application?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1216188">https://stackoverflow.com/a/1216188</a>
 */
public class APIzator1216188 {

  public static void intercept() throws Exception {
    Runtime
      .getRuntime()
      .addShutdownHook(
        new Thread() {
          public void run() {
            /*
       my shutdown code here
    */
          }
        }
      );
  }
}
