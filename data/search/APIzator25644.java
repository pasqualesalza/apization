package com.stackoverflow.api;

import java.io.IOException;

/**
 * Shutting down a computer
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/25644">https://stackoverflow.com/a/25644</a>
 */
public class APIzator25644 {

  public static void shut() throws IOException {
    Runtime runtime = Runtime.getRuntime();
    Process proc = runtime.exec("shutdown -s -t 0");
    System.exit(0);
  }
}
