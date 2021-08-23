package com.stackoverflow.api;

/**
 * Remove part of string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8695026">https://stackoverflow.com/a/8695026</a>
 */
public class APIzator8695026 {

  public static String removePart(String str, String replacement)
    throws Exception {
    System.out.println(str.replace("(with nice players)", ""));
    int index = str.indexOf("(");
    System.out.println(str.substring(0, index));
    int startIndex = str.indexOf("(");
    int endIndex = str.indexOf(")");
    String toBeReplaced = str.substring(startIndex + 1, endIndex);
    return str.replace(toBeReplaced, replacement);
  }
}
