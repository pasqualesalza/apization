package com.stackoverflow.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Java read file with whitespace in its path
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9128461">https://stackoverflow.com/a/9128461</a>
 */
public class APIzator9128461 {

  public static void readFile() throws Exception {
    File f = new File(
      "/Windows/F/Programming/Projects/NetBeans/TestApplications/database prop.properties"
    );
    System.out.println(f.exists());
    try {
      FileInputStream stream = new FileInputStream(f);
    } catch (FileNotFoundException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
