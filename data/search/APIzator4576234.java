package com.stackoverflow.api;

import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileWriter;

/**
 * Fastest way to write to file?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4576234">https://stackoverflow.com/a/4576234</a>
 */
public class APIzator4576234 {

  public static BufferedWriter way(FileDescriptor file)
    throws Exception {
    return new BufferedWriter(new FileWriter(file), 32768);
  }
}
