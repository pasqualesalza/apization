package com.stackoverflow.api;

/**
 * java Arrays.sort 2d array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15452462">https://stackoverflow.com/a/15452462</a>
 */
public class APIzator15452462 {

  public static void array(double[][] array) throws Exception {
    java.util.Arrays.sort(
      array,
      new java.util.Comparator<double[]>() {
        public int compare(double[] a, double[] b) {
          return Double.compare(a[0], b[0]);
        }
      }
    );
  }
}
