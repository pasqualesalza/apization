package com.stackoverflow.api;

/**
 * Split array into two parts without for loop in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5731124">https://stackoverflow.com/a/5731124</a>
 */
public class APIzator5731124 {

  public static void array(int[] source, int[] part1, int[] part2)
    throws Exception {
    // (src   , src-offset  , dest , offset, count)
    System.arraycopy(source, 0, part1, 0, part1.length);
    System.arraycopy(source, part1.length, part2, 0, part2.length);
  }
}
