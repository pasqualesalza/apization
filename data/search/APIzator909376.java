package com.stackoverflow.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Move / Copy File Operations in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/909376">https://stackoverflow.com/a/909376</a>
 */
public class APIzator909376 {

  public static void copyFile(File sourceFile, File destFile)
    throws IOException {
    if (!destFile.exists()) {
      destFile.createNewFile();
    }
    FileChannel source = null;
    FileChannel destination = null;
    try {
      source = new FileInputStream(sourceFile).getChannel();
      destination = new FileOutputStream(destFile).getChannel();
      // previous code: destination.transferFrom(source, 0, source.size());
      // to avoid infinite loops, should be:
      long count = 0;
      long size = source.size();
      while (
        (count += destination.transferFrom(source, count, size - count)) < size
      );
    } finally {
      if (source != null) {
        source.close();
      }
      if (destination != null) {
        destination.close();
      }
    }
  }
}
