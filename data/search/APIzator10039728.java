package com.stackoverflow.api;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Android : How to read file in bytes?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10039728">https://stackoverflow.com/a/10039728</a>
 */
public class APIzator10039728 {

  public static void android(String path) throws Exception {
    File file = new File(path);
    int size = (int) file.length();
    byte[] bytes = new byte[size];
    try {
      BufferedInputStream buf = new BufferedInputStream(
        new FileInputStream(file)
      );
      buf.read(bytes, 0, bytes.length);
      buf.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
