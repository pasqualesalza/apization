package com.stackoverflow.api;

import java.util.*;

/**
 * how to create dynamic two dimensional array in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2707431">https://stackoverflow.com/a/2707431</a>
 */
public class APIzator2707431 {

  public static void createArray(List<int[]> rowList) throws Exception {
    // ...
    for (int[] row : rowList) {
      System.out.println("Row = " + Arrays.toString(row));
    }
    // prints:
    // Row = [1, 2, 3]
    // Row = [4, 5, 6]
    // Row = [7, 8]
    // prints "5"
    System.out.println(rowList.get(1)[1]);
  }
}
