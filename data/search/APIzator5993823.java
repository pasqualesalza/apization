package com.stackoverflow.api;

/**
 * Use String.split() with multiple delimiters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5993823">https://stackoverflow.com/a/5993823</a>
 */
public class APIzator5993823 {

  public static String[] useStringsplit(String pdfName)
    throws Exception {
    return pdfName.split("-|\\.");
  }
}
