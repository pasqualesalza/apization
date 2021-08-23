package com.stackoverflow.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Closing a Java FileInputStream
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/156889">https://stackoverflow.com/a/156889</a>
 */
public class APIzator156889 {

  public static void closeFileinputstream(String file) throws Exception {
    try (InputStream in = new FileInputStream(file)) {
      // TODO: work
    } catch (IOException e) {
      // TODO: handle error
    }
    try {
      InputStream in = new FileInputStream(file);
      try {
        // TODO: work
      } finally {
        in.close();
      }
    } catch (IOException e) {
      // TODO: error handling
    }
  }
}
