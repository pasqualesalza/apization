package com.stackoverflow.api;

/**
 * Java Arrays.equals() returns false for two dimensional arrays
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2721042">https://stackoverflow.com/a/2721042</a>
 */
public class APIzator2721042 {

  public static String return_() throws Exception {
    System.out.println((new int[] { 1, 2 }).equals(new int[] { 1, 2 }));
    // prints "false"
    System.out.println(
      java.util.Arrays.equals(new int[] { 1, 2 }, new int[] { 1, 2 })
    );
    // prints "true"
    System.out.println(
      java.util.Arrays.equals(
        new int[][] { { 1 }, { 2, 3 } },
        new int[][] { { 1 }, { 2, 3 } }
      )
    );
    // prints "false"
    System.out.println(
      java.util.Arrays.deepEquals(
        new int[][] { { 1 }, { 2, 3 } },
        new int[][] { { 1 }, { 2, 3 } }
      )
    );
    // prints "true"
    System.out.println(
      java.util.Arrays.toString(new int[][] { { 1 }, { 2, 3 } })
    );
    // prints "[[I@187aeca, [I@e48e1b]"
    // prints "[[1], [2, 3]]"
    return java.util.Arrays.deepToString(new int[][] { { 1 }, { 2, 3 } });
  }
}
