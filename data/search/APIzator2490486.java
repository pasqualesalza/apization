package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * How to use java.Set
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2490486">https://stackoverflow.com/a/2490486</a>
 */
public class APIzator2490486 {

  public static void useJava(Set<Integer> numbers, int sum)
    throws Exception {
    // "[2, 5]"
    System.out.println(numbers);
    // "false"
    System.out.println(numbers.contains(7));
    // "false"
    System.out.println(numbers.add(5));
    // "2"
    System.out.println(numbers.size());
    for (int n : numbers) {
      sum += n;
    }
    // "Sum = 7"
    System.out.println("Sum = " + sum);
    numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
    // "[1, 2, 3, 4, 5]"
    System.out.println(numbers);
    numbers.removeAll(Arrays.asList(4, 5, 6, 7));
    // "[1, 2, 3]"
    System.out.println(numbers);
    numbers.retainAll(Arrays.asList(2, 3, 4, 5));
    // "[2, 3]"
    System.out.println(numbers);
  }
}
