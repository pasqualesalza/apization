package com.stackoverflow.api;

/**
 * How to start anonymous thread class
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9625135">https://stackoverflow.com/a/9625135</a>
 */
public class APIzator9625135 {

  public static void startClass() throws Exception {
    new Thread() {
      public void run() {
        System.out.println("blah");
      }
    }
      .start();
    Thread t = new Thread() {
      public void run() {
        System.out.println("blah");
      }
    };
    t.start();
  }
}
