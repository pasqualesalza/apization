package com.stackoverflow.api;

/**
 * How do you replace double quotes with a blank space in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2360247">https://stackoverflow.com/a/2360247</a>
 */
public class APIzator2360247 {

  public static String replaceQuote() throws Exception {
    System.out.println(
      "I don't like these \"double\" quotes".replace("\"", " ")
    );
    System.out.println(
      "I don't like these \"double\" quotes".replace('"', ' ')
    );
    return "I don't like these \"double\" quotes".replace("\"", "");
  }
}
