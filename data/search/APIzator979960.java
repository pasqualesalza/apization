package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Read unicode text files with java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/979960">https://stackoverflow.com/a/979960</a>
 */
public class APIzator979960 {

  public static BufferedReader readFile(Charset encoding, InputStream stream)
    throws Exception {
    return new BufferedReader(new InputStreamReader(stream, encoding));
  }
}
