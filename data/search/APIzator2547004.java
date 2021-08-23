package com.stackoverflow.api;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Open PDF file on the fly from a Java application
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2547004">https://stackoverflow.com/a/2547004</a>
 */
public class APIzator2547004 {

  public static void openFile(String str1) throws Exception {
    if (Desktop.isDesktopSupported()) {
      try {
        File myFile = new File(str1);
        Desktop.getDesktop().open(myFile);
      } catch (IOException ex) {
        // no application registered for PDFs
      }
    }
  }
}
