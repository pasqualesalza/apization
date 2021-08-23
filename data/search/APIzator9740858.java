package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection to Iterable
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9740858">https://stackoverflow.com/a/9740858</a>
 */
public class APIzator9740858 {

  public static void collection(List<String> list) {
    Iterable<String> iterable = list;
    for (String s : iterable) {
      System.out.println(s);
    }
  }
}
