package com.stackoverflow.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Read Content from Files which are inside Zip file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15667326">https://stackoverflow.com/a/15667326</a>
 */
public class APIzator15667326 {

  public static void readContent() throws IOException {
    ZipFile zipFile = new ZipFile("C:/test.zip");
    Enumeration<? extends ZipEntry> entries = zipFile.entries();
    while (entries.hasMoreElements()) {
      ZipEntry entry = entries.nextElement();
      InputStream stream = zipFile.getInputStream(entry);
    }
  }
}
