package com.stackoverflow.api;

/**
 * How Do I Split A String By Line Break?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13464983">https://stackoverflow.com/a/13464983</a>
 */
public class APIzator13464983 {

  public static String[] splitString(String yourString)
    throws Exception {
    return yourString.split("\\r\\n|\\n|\\r");
  }
}
