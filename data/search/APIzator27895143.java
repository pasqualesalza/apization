package com.stackoverflow.api;

/**
 * NullPointerException: Attempt to invoke virtual method 'boolean java.lang.String.equalsIgnoreCase(java.lang.String)' on a null object reference
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27895143">https://stackoverflow.com/a/27895143</a>
 */
public class APIzator27895143 {

  public static void nullpointerexception(String called_from)
    throws Exception {
    if (called_from != null && called_from.equalsIgnoreCase("add")) {}
    if ("add".equalsIgnoreCase(called_from)) {
      // <-- safe if called_from is null
    }
  }
}
