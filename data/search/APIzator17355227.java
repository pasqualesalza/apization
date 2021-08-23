package com.stackoverflow.api;

import java.nio.charset.Charset;

/**
 * Java ByteBuffer to String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17355227">https://stackoverflow.com/a/17355227</a>
 */
public class APIzator17355227 {

  public static String bytebuffer(String k) throws Exception {
    byte[] bytes = k.getBytes(Charset.forName("UTF-8"));
    return new String(bytes, Charset.forName("UTF-8"));
  }
}
