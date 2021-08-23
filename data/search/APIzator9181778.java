package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * reading text from file and store each word from every line into separate variables
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9181778">https://stackoverflow.com/a/9181778</a>
 */
public class APIzator9181778 {

  public static void readText() throws IOException {
    File file = new File("/path/to/InputFile");
    BufferedReader br = new BufferedReader(
      new InputStreamReader(new FileInputStream(file))
    );
    String line = null;
    while ((line = br.readLine()) != null) {
      // \\s+ means any number of whitespaces between tokens
      String[] tokens = line.split("\\s+");
      String var_1 = tokens[0];
      String var_2 = tokens[1];
      String var_3 = tokens[2];
    }
  }
}
