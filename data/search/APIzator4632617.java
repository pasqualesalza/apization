package com.stackoverflow.api;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Android - Generate CSV file from table values
 *
 * classpath: opencsv-2.3
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4632617">https://stackoverflow.com/a/4632617</a>
 */
public class APIzator4632617 {

  public static void file() throws Exception {
    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter("/sdcard/myfile.csv"), ',');
      // array of your values
      String[] entries = "first#second#third".split("#");
      writer.writeNext(entries);
      writer.close();
    } catch (IOException e) {
      // error
    }
  }
}
