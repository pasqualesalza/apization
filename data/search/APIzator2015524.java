package com.stackoverflow.api;

/**
 * How to view the current heap size that an application is using?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2015524">https://stackoverflow.com/a/2015524</a>
 */
public class APIzator2015524 {

  public static long viewSize() throws Exception {
    // Get current size of heap in bytes
    long heapSize = Runtime.getRuntime().totalMemory();
    // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
    long heapMaxSize = Runtime.getRuntime().maxMemory();
    return Runtime.getRuntime().freeMemory();
  }
}
