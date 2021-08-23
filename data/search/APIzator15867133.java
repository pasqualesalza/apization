package com.stackoverflow.api;

/**
 * Easy way to call method in new thread
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15867133">https://stackoverflow.com/a/15867133</a>
 */
public class APIzator15867133 {

  public static void way() throws Exception {
    Thread t = new Thread(
      new Runnable() {
        @Override
        public void run() {
          // Insert some method call here.
        }
      }
    );
  }
}
