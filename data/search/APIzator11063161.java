package com.stackoverflow.api;

import java.util.Locale;

/**
 * Using Locales with Java's toLowerCase() and toUpperCase()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11063161">https://stackoverflow.com/a/11063161</a>
 */
public class APIzator11063161 {

  public static void useLocales(String str) throws Exception {
    // setting Lithuanian as locale
    Locale.setDefault(new Locale("lt"));
    System.out.println(
      "Before case conversion is " +
      str +
      " and length is " + // Ì
      str.length()
    );
    String lowerCaseStr = str.toLowerCase();
    System.out.println(
      "Lower case is " +
      lowerCaseStr +
      " and length is " + // iı`
      lowerCaseStr.length()
    );
  }
}
