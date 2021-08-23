package com.stackoverflow.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Whole text file to a String in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3849771">https://stackoverflow.com/a/3849771</a>
 */
public class APIzator3849771 {

  public static String readStream(InputStream is) {
    StringBuilder sb = new StringBuilder(512);
    try {
      Reader r = new InputStreamReader(is, "UTF-8");
      int c = 0;
      while ((c = r.read()) != -1) {
        sb.append((char) c);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return sb.toString();
  }
}
