package com.stackoverflow.api;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Change priorityQueue to max priorityqueue
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11003264">https://stackoverflow.com/a/11003264</a>
 */
public class APIzator11003264 {

  public static void changePriorityqueue() throws Exception {
    PriorityQueue<Integer> queue = new PriorityQueue<>(
      10,
      Collections.reverseOrder()
    );
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    // ...
    Integer val = null;
    while ((val = queue.poll()) != null) {
      System.out.println(val);
    }
  }
}
