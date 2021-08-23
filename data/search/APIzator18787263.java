package com.stackoverflow.api;

/**
 * How to split the string a android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18787263">https://stackoverflow.com/a/18787263</a>
 */
public class APIzator18787263 {

  public static String splitString(String imgpath) throws Exception {
    String result = imgpath.substring(imgpath.lastIndexOf("/") + 1);
    return result;
  }
}
