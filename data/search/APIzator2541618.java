package com.stackoverflow.api;

/**
 * How to gracefully handle the SIGKILL signal in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2541618">https://stackoverflow.com/a/2541618</a>
 */
public class APIzator2541618 {

  public static void handleSignal() throws InterruptedException {
    Runtime
      .getRuntime()
      .addShutdownHook(
        new Thread() {
          @Override
          public void run() {
            System.out.println("Shutdown hook ran!");
          }
        }
      );
    while (true) {
      Thread.sleep(1000);
    }
  }
}
