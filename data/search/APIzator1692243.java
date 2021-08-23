package com.stackoverflow.api;

/**
 * Is it possible to catch out of memory exception in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1692243">https://stackoverflow.com/a/1692243</a>
 */
public class APIzator1692243 {

  public static void be() throws Exception {
    try {
      // create lots of objects here and stash them somewhere
    } catch (OutOfMemoryError E) {
      // release some (all) of the above objects
    }
  }
}
