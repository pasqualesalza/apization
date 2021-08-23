package com.stackoverflow.api;

/**
 * First char to upper case
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11464979">https://stackoverflow.com/a/11464979</a>
 */
public class APIzator11464979 {

  public static void char_(String betterIdea, String userIdea)
    throws Exception {
    char first = Character.toUpperCase(userIdea.charAt(0));
    betterIdea = first + userIdea.substring(1);
    betterIdea =
      Character.toUpperCase(userIdea.charAt(0)) + userIdea.substring(1);
  }
}
