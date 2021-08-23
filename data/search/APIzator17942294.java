package com.stackoverflow.api;

/**
 * String is immutable. What exactly is the meaning?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17942294">https://stackoverflow.com/a/17942294</a>
 */
public class APIzator17942294 {

  public static String be(String str, String s1) throws Exception {
    // assigns a new reference to the same string "knowledge"
    String s = str;
    str = str.concat(" base");
    s1.concat(" rules");
    return s1;
  }
}
