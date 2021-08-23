package com.stackoverflow.api;

/**
 * transpose double[][] matrix with a java function?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15497288">https://stackoverflow.com/a/15497288</a>
 */
public class APIzator15497288 {

  public static double[][] transposeMatrix(double[][] m) {
    double[][] temp = new double[m[0].length][m.length];
    for (int i = 0; i < m.length; i++) for (
      int j = 0;
      j < m[0].length;
      j++
    ) temp[j][i] = m[i][j];
    return temp;
  }
}
