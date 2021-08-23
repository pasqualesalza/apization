package com.stackoverflow.api;

import java.io.File;
import java.io.IOException;

/**
 * Java 1.6 - determine symbolic links
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/813730">https://stackoverflow.com/a/813730</a>
 */
public class APIzator813730 {

  public static boolean isSymlink(File file) throws IOException {
    if (file == null) throw new NullPointerException("File must not be null");
    File canon;
    if (file.getParent() == null) {
      canon = file;
    } else {
      File canonDir = file.getParentFile().getCanonicalFile();
      canon = new File(canonDir, file.getName());
    }
    return !canon.getCanonicalFile().equals(canon.getAbsoluteFile());
  }
}
