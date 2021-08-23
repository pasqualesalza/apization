package com.stackoverflow.api;

/**
 * How to round up the result of integer division?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17974">https://stackoverflow.com/a/17974</a>
 */
public class APIzator17974 {

  public static int round(int recordsPerPage, int records)
    throws Exception {
    return (records + recordsPerPage - 1) / recordsPerPage;
  }
}
