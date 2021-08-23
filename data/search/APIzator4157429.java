package com.stackoverflow.api;

import java.io.IOException;
import java.io.OutputStream;

/**
 * How to execute cmd commands via Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4157429">https://stackoverflow.com/a/4157429</a>
 */
public class APIzator4157429 {

  public static void executeCommand(String command) throws Exception {
    try {
      Process child = Runtime.getRuntime().exec(command);
      // Get output stream to write from it
      OutputStream out = child.getOutputStream();
      out.write("cd C:/ /r/n".getBytes());
      out.flush();
      out.write("dir /r/n".getBytes());
      out.close();
    } catch (IOException e) {}
  }
}
