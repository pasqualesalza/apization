package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * How can check if we can cast an object to another
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17759946">https://stackoverflow.com/a/17759946</a>
 */
public class APIzator17759946 {

  public static void check() {
    ArrayList<String> ar1 = new ArrayList<String>();
    ArrayList<Character> obj = new ArrayList<Character>();
    if (obj instanceof java.util.ArrayList) System.out.println(
      "My problem Solved"
    );
  }
}
