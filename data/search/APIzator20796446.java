package com.stackoverflow.api;

import java.nio.file.Files;
import java.nio.file.Paths;
import javax.crypto.*;

/**
 * AES Encryption and Decryption with Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20796446">https://stackoverflow.com/a/20796446</a>
 */
public class APIzator20796446 {

  public static void encryption(String fileName, String fileName2)
    throws Exception {
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secKey = keyGen.generateKey();
    Cipher aesCipher = Cipher.getInstance("AES");
    byte[] byteText = "Your Plain Text Here".getBytes();
    aesCipher.init(Cipher.ENCRYPT_MODE, secKey);
    byte[] byteCipherText = aesCipher.doFinal(byteText);
    Files.write(Paths.get(fileName), byteCipherText);
    byte[] cipherText = Files.readAllBytes(Paths.get(fileName));
    aesCipher.init(Cipher.DECRYPT_MODE, secKey);
    byte[] bytePlainText = aesCipher.doFinal(cipherText);
    Files.write(Paths.get(fileName2), bytePlainText);
  }
}
