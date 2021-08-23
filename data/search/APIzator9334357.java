package com.stackoverflow.api;

import java.security.*;

/**
 * How can I list the available Cipher algorithms?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9334357">https://stackoverflow.com/a/9334357</a>
 */
public class APIzator9334357 {

  public static void listAlgorithm() throws Exception {
    for (Provider provider : Security.getProviders()) {
      System.out.println(provider.getName());
      for (String key : provider.stringPropertyNames()) System.out.println(
        "\t" + key + "\t" + provider.getProperty(key)
      );
    }
  }
}
