package com.stackoverflow.api;

/**
 * Check if a value exists in ArrayList
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4404149">https://stackoverflow.com/a/4404149</a>
 */
public class APIzator4404149 {

  public static void check(String conta1, String lista)
    throws Exception {
    if (lista.contains(conta1)) {
      System.out.println("Account found");
    } else {
      System.out.println("Account not found");
    }
  }
}
