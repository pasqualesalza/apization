package com.stackoverflow.api;

/**
 * Checking letter case (Upper/Lower) within a string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16127946">https://stackoverflow.com/a/16127946</a>
 */
public class APIzator16127946 {

  public static void checkCase(String password) throws Exception {
    boolean hasUppercase = !password.equals(password.toLowerCase());
    boolean hasLowercase = !password.equals(password.toUpperCase());
    if (!hasUppercase) System.out.println("Must have an uppercase Character");
    if (!hasLowercase) System.out.println("Must have a lowercase Character");
  }
}
