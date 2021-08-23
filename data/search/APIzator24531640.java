package com.stackoverflow.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Exception: Unexpected end of ZLIB input stream
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24531640">https://stackoverflow.com/a/24531640</a>
 */
public class APIzator24531640 {

  public static int exception(String name)
    throws FileNotFoundException, IOException {
    GZIPOutputStream gz = new GZIPOutputStream(new FileOutputStream(name));
    gz.write(10);
    gz.close();
    return new GZIPInputStream(new FileInputStream(name)).read();
  }
}
