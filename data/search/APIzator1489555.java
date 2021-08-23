package com.stackoverflow.api;

/**
 * How to replace ï¿½ in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1489555">https://stackoverflow.com/a/1489555</a>
 */
public class APIzator1489555 {

  public static void replace(String strImport) throws Exception {
    strImport = strImport.replaceAll("\uFFFD", "\"");
  }
}
