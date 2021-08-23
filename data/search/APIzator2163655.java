package com.stackoverflow.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * In Java, how can I convert an InputStream into a byte array (byte[])?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2163655">https://stackoverflow.com/a/2163655</a>
 */
public class APIzator2163655 {

  public static byte[] readFully(InputStream input) throws IOException {
    byte[] buffer = new byte[8192];
    int bytesRead;
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    while ((bytesRead = input.read(buffer)) != -1) {
      output.write(buffer, 0, bytesRead);
    }
    return output.toByteArray();
  }
}
