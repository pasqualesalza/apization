package com.stackoverflow.api;

import com.amazonaws.util.StringUtils;

/**
 * Fastest way to put contents of Set<String> to a single String with words separated by a whitespace?
 *
 * classpath: aws-java-sdk-core-1.11.446
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3042606">https://stackoverflow.com/a/3042606</a>
 */
public class APIzator3042606 {

  public static String way(String set, String set_1) throws Exception {
    String str_1 = StringUtils.join(set_1, " ");
    return String.join(",", set);
  }
}
