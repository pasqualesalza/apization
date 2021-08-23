package com.stackoverflow.api;

/**
 * is there a 'block until condition becomes true' function in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5999146">https://stackoverflow.com/a/5999146</a>
 */
public class APIzator5999146 {

  public static void be(String syncObject) throws Exception {
    synchronized (syncObject) {
      try {
        // Calling wait() will block this thread until another thread
        // calls notify() on the object.
        syncObject.wait();
      } catch (InterruptedException e) {
        // Happens if someone interrupts your thread.
      }
    }
    // Do something
    // If the condition is true, do the following:
    synchronized (syncObject) {
      syncObject.notify();
    }
  }
}
