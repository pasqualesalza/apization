package com.stackoverflow.api;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Java: Find .txt files in specified folder
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1385015">https://stackoverflow.com/a/1385015</a>
 */
public class APIzator1385015 {

  public static File[] finder(String dirName) {
    File dir = new File(dirName);
    return dir.listFiles(
      new FilenameFilter() {
        public boolean accept(File dir, String filename) {
          return filename.endsWith(".txt");
        }
      }
    );
  }
}
