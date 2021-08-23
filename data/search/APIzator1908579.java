package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Java: How to use Thread.join
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1908579">https://stackoverflow.com/a/1908579</a>
 */
public class APIzator1908579 {

  public static void executeMultiThread(int numThreads) throws Exception {
    List threads = new ArrayList();
    for (int i = 0; i < numThreads; i++) {
      Thread t = new Thread(
        new Runnable() {
          public void run() {
            // do your work
          }
        }
      );
      // System.out.println("STARTING: " + t);
      t.start();
      threads.add(t);
    }
    for (int i = 0; i < threads.size(); i++) {
      // Big number to wait so this can be debugged
      // System.out.println("JOINING: " + threads.get(i));
      ((Thread) threads.get(i)).join(1000000);
    }
  }
}
