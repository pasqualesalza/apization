package com.stackoverflow.api;

/**
 * How do I initialize a byte array in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11208685">https://stackoverflow.com/a/11208685</a>
 */
public class APIzator11208685 {

  byte[] CDRIVES = hexStringToByteArray("e04fd020ea3a6910a2d808002b30309d");

  public static byte[] hexStringToByteArray(String s) {
    int len = s.length();
    byte[] data = new byte[len / 2];
    for (int i = 0; i < len; i += 2) {
      data[i / 2] =
        (byte) (
          (Character.digit(s.charAt(i), 16) << 4) +
          Character.digit(s.charAt(i + 1), 16)
        );
    }
    return data;
  }
}
