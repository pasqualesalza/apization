package com.stackoverflow.api;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * Simplest way to encrypt a text file in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27962481">https://stackoverflow.com/a/27962481</a>
 */
public class APIzator27962481 {

  public static void way() {
    try {
      KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
      SecretKey myDesKey = keygenerator.generateKey();
      Cipher desCipher;
      desCipher = Cipher.getInstance("DES");
      byte[] text = "No body can see me.".getBytes("UTF8");
      desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
      byte[] textEncrypted = desCipher.doFinal(text);
      String s = new String(textEncrypted);
      System.out.println(s);
      desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
      byte[] textDecrypted = desCipher.doFinal(textEncrypted);
      s = new String(textDecrypted);
      System.out.println(s);
    } catch (Exception e) {
      System.out.println("Exception");
    }
  }
}
