package com.stackoverflow.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * error: unreported exception FileNotFoundException; must be caught or declared to be thrown
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19789169">https://stackoverflow.com/a/19789169</a>
 */
public class APIzator19789169 {

  public static void catch_(String str1) throws FileNotFoundException {
    File file = new File(str1);
    file.getParentFile().mkdirs();
    try {
      PrintWriter printWriter = new PrintWriter(file);
      printWriter.println("hello");
      printWriter.close();
    } catch (FileNotFoundException ex) {
      // insert code to run when exception occurs
    }
  }
}
