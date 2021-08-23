package com.stackoverflow.api;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Listing files in a directory matching a pattern in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2102989">https://stackoverflow.com/a/2102989</a>
 */
public class APIzator2102989 {

  public static void listFile() throws Exception {
    File dir = new File(".");
    File[] files = dir.listFiles(
      new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
          return name.endsWith(".xml");
        }
      }
    );
    for (File xmlfile : files) {
      System.out.println(xmlfile);
    }
  }
}
