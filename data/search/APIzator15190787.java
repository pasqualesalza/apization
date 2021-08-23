package com.stackoverflow.api;

import java.text.Normalizer;

/**
 * Easy way to remove accents from a Unicode string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15190787">https://stackoverflow.com/a/15190787</a>
 */
public class APIzator15190787 {

  public static String stripAccents(String s) {
    s = Normalizer.normalize(s, Normalizer.Form.NFD);
    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    return s;
  }
}
