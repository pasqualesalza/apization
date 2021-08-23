package com.stackoverflow.api;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

/**
 * Compute SHA-1 of byte array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1515495">https://stackoverflow.com/a/1515495</a>
 */
public class APIzator1515495 {

  public static String SHAsum(byte[] convertme)
    throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-1");
    return byteArray2Hex(md.digest(convertme));
  }

  private static String byteArray2Hex(final byte[] hash) {
    Formatter formatter = new Formatter();
    for (byte b : hash) {
      formatter.format("%02x", b);
    }
    return formatter.toString();
  }
}
