package com.stackoverflow.api;

/**
 * Java String remove all non numeric characters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10372905">https://stackoverflow.com/a/10372905</a>
 */
public class APIzator10372905 {

  public static void removeCharacter(String str) throws Exception {
    str = str.replaceAll("[^\\d.]", "");
  }
}
