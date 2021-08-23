package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Specific difference between bufferedreader and filereader
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9648877">https://stackoverflow.com/a/9648877</a>
 */
public class APIzator9648877 {

  public static BufferedReader difference() throws Exception {
    return new BufferedReader(new InputStreamReader(System.in));
  }
}
