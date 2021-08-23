package com.stackoverflow.api;

/**
 * Object not locked by thread before notify() in onPostExecute
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24186147">https://stackoverflow.com/a/24186147</a>
 */
public class APIzator24186147 {

  public static void lock(String anotherObj, String obj)
    throws Exception {
    synchronized (obj) {
      obj.notify();
    }
    synchronized (obj) {
      // notify() is being called here when the thread and
      // synchronized block does not own the lock on the object.
      anotherObj.notify();
    }
  }
}
