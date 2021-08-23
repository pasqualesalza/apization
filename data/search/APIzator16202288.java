package com.stackoverflow.api;

import org.apache.commons.io.FilenameUtils;

/**
 * How do I get the file extension of a file in Java?
 *
 * classpath: commons-io-2.6
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16202288">https://stackoverflow.com/a/16202288</a>
 */
public class APIzator16202288 {

  public static String getExtension(String str1) throws Exception {
    // returns "txt"
    String ext1 = FilenameUtils.getExtension(str1);
    return FilenameUtils.getExtension("bar.exe");
  }
}
