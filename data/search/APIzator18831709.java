package com.stackoverflow.api;

/**
 * How can I remove punctuation from input text in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18831709">https://stackoverflow.com/a/18831709</a>
 */
public class APIzator18831709 {

  public static String[] removePunctuation(String instring)
    throws Exception {
    return instring.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
  }
}
