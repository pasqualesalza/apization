package com.stackoverflow.api;

import java.io.*;
import java.util.zip.*;

/**
 * Creating zip archive in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8337985">https://stackoverflow.com/a/8337985</a>
 */
public class APIzator8337985 {

  public static void createArchive(byte[] b, String str1, String str2)
    throws Exception {
    // input file
    FileInputStream in = new FileInputStream(str1);
    // out put file
    ZipOutputStream out = new ZipOutputStream(
      new FileOutputStream("F:/tmp.zip")
    );
    // name the file inside the zip  file
    out.putNextEntry(new ZipEntry(str2));
    int count;
    while ((count = in.read(b)) > 0) {
      out.write(b, 0, count);
    }
    out.close();
    in.close();
  }
}
