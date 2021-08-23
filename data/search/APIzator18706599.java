package com.stackoverflow.api;

/**
 * String.concat() doesn't do concatenation
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18706599">https://stackoverflow.com/a/18706599</a>
 */
public class APIzator18706599 {

  public static void doConcatenation(String messages, int ch, int random)
    throws Exception {
    messages = messages.concat(String.valueOf(random));
    messages = messages.concat(" ");
    messages = messages.concat(String.valueOf(ch));
    messages = messages.concat(" ");
    messages = String.valueOf(random) + " " + String.valueOf(ch) + " ";
  }
}
