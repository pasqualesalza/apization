package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * How to convert FileInputStream into string in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15161665">https://stackoverflow.com/a/15161665</a>
 */
public class APIzator15161665 {

  // Commented this out because this is not the efficient way to achieve that
  // StringBuilder builder = new StringBuilder();
  // int ch;
  // while((ch = fis.read()) != -1){
  // builder.append((char)ch);
  // }
  //
  // System.out.println(builder.toString());
  public static String getFileContent(FileInputStream fis, String encoding)
    throws IOException {
    try (
      BufferedReader br = new BufferedReader(
        new InputStreamReader(fis, encoding)
      )
    ) {
      StringBuilder sb = new StringBuilder();
      String line;
      while ((line = br.readLine()) != null) {
        sb.append(line);
        sb.append('\n');
      }
      return sb.toString();
    }
  }
}
