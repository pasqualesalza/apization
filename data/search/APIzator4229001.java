package com.stackoverflow.api;

import java.util.Collections;
import java.util.List;
import java.util.List;
import java.util.Random;

/**
 * How to randomize two ArrayLists in the same fashion?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4229001">https://stackoverflow.com/a/4229001</a>
 */
public class APIzator4229001 {

  public static void randomizeArraylists(List imgList, List fileList)
    throws Exception {
    long seed = System.nanoTime();
    Collections.shuffle(fileList, new Random(seed));
    Collections.shuffle(imgList, new Random(seed));
  }
}
