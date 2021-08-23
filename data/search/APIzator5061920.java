package com.stackoverflow.api;

/**
 * printing out a 2-D array in Matrix format
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5061920">https://stackoverflow.com/a/5061920</a>
 */
public class APIzator5061920 {

  public static void print(int[][] matrix) throws Exception {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
