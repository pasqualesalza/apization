package com.stackoverflow.api;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5748802">https://stackoverflow.com/a/5748802</a>
 */
public class APIzator5748802 {

  public static void myMethod() {
    String file = "c:\\system.txt";
    try {
      FileOutputStream outStr = new FileOutputStream(file, true);
    } catch (FileNotFoundException fnfe) {
      System.out.println(fnfe.getMessage());
    }
  }
}
