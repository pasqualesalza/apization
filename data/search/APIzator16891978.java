package com.stackoverflow.api;

import java.io.*;

/**
 * How to read pdf file and write it to outputStream
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16891978">https://stackoverflow.com/a/16891978</a>
 */
public class APIzator16891978 {

  public static void readFile(byte[] buf, String str1, String str2)
    throws IOException {
    File f = new File("C:\\Documents and Settings\\abc\\Desktop\\abc.pdf");
    OutputStream oos = new FileOutputStream(str1);
    InputStream is = new FileInputStream(f);
    int c = 0;
    while ((c = is.read(buf, 0, buf.length)) > 0) {
      oos.write(buf, 0, c);
      oos.flush();
    }
    oos.close();
    System.out.println("stop");
    is.close();
  }
}
