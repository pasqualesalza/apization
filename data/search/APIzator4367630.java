package com.stackoverflow.api;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * What is the difference between Reader and InputStream?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4367630">https://stackoverflow.com/a/4367630</a>
 */
public class APIzator4367630 {

  public static Reader be(InputStream inputStream) throws Exception {
    return new InputStreamReader(inputStream, StandardCharsets.UTF_8);
  }
}
