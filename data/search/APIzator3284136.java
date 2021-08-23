package com.stackoverflow.api;

/**
 * Size of data after AES/CBC and AES/ECB encryption
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3284136">https://stackoverflow.com/a/3284136</a>
 */
public class APIzator3284136 {

  public static void size(int clearLen, int cipherLen) throws Exception {
    cipherLen = (clearLen / 16 + 1) * 16;
  }
}
