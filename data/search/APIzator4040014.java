package com.stackoverflow.api;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * Creating random numbers with no duplicates
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4040014">https://stackoverflow.com/a/4040014</a>
 */
public class APIzator4040014 {

  public static void createNumber(int numbersNeeded, int max)
    throws Exception {
    if (max < numbersNeeded) {
      throw new IllegalArgumentException(
        "Can't ask for more numbers than are available"
      );
    }
    // Ideally just create one instance globally
    Random rng = new Random();
    // Note: use LinkedHashSet to maintain insertion order
    Set<Integer> generated = new LinkedHashSet<Integer>();
    while (generated.size() < numbersNeeded) {
      Integer next = rng.nextInt(max) + 1;
      // As we're adding to a set, this will automatically do a containment check
      generated.add(next);
    }
  }
}
