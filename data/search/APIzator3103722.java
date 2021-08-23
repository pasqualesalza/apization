package com.stackoverflow.api;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Hash String via SHA-256 in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3103722">https://stackoverflow.com/a/3103722</a>
 */
public class APIzator3103722 {

  public static String string(String text) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    // Change this to UTF-16 if needed
    md.update(text.getBytes(StandardCharsets.UTF_8));
    byte[] digest = md.digest();
    String hex = String.format("%064x", new BigInteger(1, digest));
    return hex;
  }
}
