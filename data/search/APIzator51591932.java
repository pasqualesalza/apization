package com.stackoverflow.api;

import java.util.StringJoiner;

/**
 * StringBuilder append content to a new line every time
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/51591932">https://stackoverflow.com/a/51591932</a>
 */
public class APIzator51591932 {

  public static StringJoiner content() throws Exception {
    StringJoiner formattedString = new StringJoiner("\n");
    formattedString.add("XXX");
    formattedString.add("YYY");
    return formattedString;
  }
}
