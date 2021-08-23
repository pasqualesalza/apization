package com.stackoverflow.api;

/**
 * Explode and Implode (just like PHP) in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16774264">https://stackoverflow.com/a/16774264</a>
 */
public class APIzator16774264 {

  public static String explode(String foo) throws Exception {
    String[] split = foo.split(",");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < split.length; i++) {
      sb.append(split[i]);
      if (i != split.length - 1) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }
}
