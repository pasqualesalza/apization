package com.stackoverflow.api;

import android.util.Base64;
import java.net.URL;

/**
 * java.lang.NoSuchMethodError: org.apache.commons.codec.binary.Base64.encodeBase64String() in Java EE application
 *
 * classpath: android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7688667">https://stackoverflow.com/a/7688667</a>
 */
public class APIzator7688667 {

  public static URL javalang() throws Exception {
    return Base64.class.getProtectionDomain().getCodeSource().getLocation();
  }
}
