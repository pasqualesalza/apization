package com.stackoverflow.api;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Difference between printStackTrace() and toString()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10120715">https://stackoverflow.com/a/10120715</a>
 */
public class APIzator10120715 {

  public static String exceptionStacktraceToString(Exception e) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    e.printStackTrace(ps);
    ps.close();
    return baos.toString();
  }
}
