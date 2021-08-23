package com.stackoverflow.api;

import java.io.File;
import java.io.IOException;

/**
 * How to create a temporary directory/folder in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/617438">https://stackoverflow.com/a/617438</a>
 */
public class APIzator617438 {

  public static File createTempDirectory() throws IOException {
    final File temp;
    temp = File.createTempFile("temp", Long.toString(System.nanoTime()));
    if (!(temp.delete())) {
      throw new IOException(
        "Could not delete temp file: " + temp.getAbsolutePath()
      );
    }
    if (!(temp.mkdir())) {
      throw new IOException(
        "Could not create temp directory: " + temp.getAbsolutePath()
      );
    }
    return (temp);
  }
}
