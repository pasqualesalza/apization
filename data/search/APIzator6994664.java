package com.stackoverflow.api;

import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * how to delete the content of text file without deleting itself
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6994664">https://stackoverflow.com/a/6994664</a>
 */
public class APIzator6994664 {

  public static void deleteContent(OutputStream file) throws Exception {
    PrintWriter writer = new PrintWriter(file);
    writer.print("");
    writer.close();
  }
}
