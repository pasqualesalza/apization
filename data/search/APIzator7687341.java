package com.stackoverflow.api;

/**
 * Java: Array with loop
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7687341">https://stackoverflow.com/a/7687341</a>
 */
public class APIzator7687341 {

  public static void java(int sum) throws Exception {
    // Create an array with room for 100 integers
    int[] nums = new int[100];
    for (int n : nums) sum += n;
    // Print the result (5050)
    System.out.println(sum);
  }
}
