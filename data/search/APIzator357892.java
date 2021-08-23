package com.stackoverflow.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * In Java: How to zip file from byte[] array?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/357892">https://stackoverflow.com/a/357892</a>
 */
public class APIzator357892 {

  public static byte[] zipBytes(String filename, byte[] input)
    throws IOException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ZipOutputStream zos = new ZipOutputStream(baos);
    ZipEntry entry = new ZipEntry(filename);
    entry.setSize(input.length);
    zos.putNextEntry(entry);
    zos.write(input);
    zos.closeEntry();
    zos.close();
    return baos.toByteArray();
  }
}
