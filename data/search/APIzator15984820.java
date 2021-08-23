package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * What exactly does "Stream" and "Buffer" mean in Java I/O?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15984820">https://stackoverflow.com/a/15984820</a>
 */
public class APIzator15984820 {

  public static BufferedReader stream() throws Exception {
    return new BufferedReader(new InputStreamReader(System.in));
  }
}
