package com.stackoverflow.api;

import org.apache.commons.io.FilenameUtils;

/**
 * How to get the filename without the extension in Java?
 *
 * classpath: commons-io-2.6
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1807868">https://stackoverflow.com/a/1807868</a>
 */
public class APIzator1807868 {

  public static String getFilename(String fileNameWithExt)
    throws Exception {
    return FilenameUtils.removeExtension(fileNameWithExt);
  }
}
