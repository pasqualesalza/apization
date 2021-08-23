package com.stackoverflow.api;

/**
 * Java - Counting numbers in array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19705783">https://stackoverflow.com/a/19705783</a>
 */
public class APIzator19705783 {

  public static void number(int[] arryNum) throws Exception {
    int[] counter = new int[] { 0, 0, 0, 0, 0 };
    for (int i = 0; i < arryNum.length; i++) {
      counter[arryNum[i] - 1]++;
    }
    for (int i = 0; i < counter.length; i++) System.out.println(
      (i + 1) + ":" + counter[i]
    );
  }
}
