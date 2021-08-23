package com.stackoverflow.api;

/**
 * Is there a command in java to make the program go back to the beginning of a loop
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17660889">https://stackoverflow.com/a/17660889</a>
 */
public class APIzator17660889 {

  public static void be(String searchMe, int max) throws Exception {
    int numPs = 0;
    for (int i = 0; i < max; i++) {
      // interested only in p's
      if (searchMe.charAt(i) != 'p') continue;
      // process p's
      numPs++;
    }
  }
}
