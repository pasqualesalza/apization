package com.stackoverflow.api;

/**
 * Putting char into a java string for each N characters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/537190">https://stackoverflow.com/a/537190</a>
 */
public class APIzator537190 {

  public static String insertPeriodically(
    String text,
    String insert,
    int period
  ) {
    StringBuilder builder = new StringBuilder(
      text.length() + insert.length() * (text.length() / period) + 1
    );
    int index = 0;
    String prefix = "";
    while (index < text.length()) {
      // Don't put the insert in the very first iteration.
      // This is easier than appending it *after* each substring
      builder.append(prefix);
      prefix = insert;
      builder.append(
        text.substring(index, Math.min(index + period, text.length()))
      );
      index += period;
    }
    return builder.toString();
  }
}
