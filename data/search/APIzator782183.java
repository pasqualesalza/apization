package com.stackoverflow.api;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * How do I convert a String to an InputStream in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/782183">https://stackoverflow.com/a/782183</a>
 */
public class APIzator782183 {

  public static InputStream convertString(String exampleString)
    throws Exception {
    return new ByteArrayInputStream(
      exampleString.getBytes(StandardCharsets.UTF_8)
    );
  }
}
