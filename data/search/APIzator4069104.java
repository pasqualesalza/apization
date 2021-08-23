package com.stackoverflow.api;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Write string to output stream
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4069104">https://stackoverflow.com/a/4069104</a>
 */
public class APIzator4069104 {

  public static void writeString(String str1) throws Exception {
    try (PrintWriter p = new PrintWriter(new FileOutputStream(str1, true))) {
      p.println("Hello");
    } catch (FileNotFoundException e1) {
      e1.printStackTrace();
    }
  }
}
