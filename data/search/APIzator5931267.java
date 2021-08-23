package com.stackoverflow.api;

/**
 * java: use StringBuilder to insert at the beginning
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5931267">https://stackoverflow.com/a/5931267</a>
 */
public class APIzator5931267 {

  public static void useStringbuilder() throws Exception {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      sb.insert(0, Integer.toString(i));
    }
  }
}
