package com.stackoverflow.api;

import java.util.*;

/**
 * how to take user input in Array using java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2623292">https://stackoverflow.com/a/2623292</a>
 */
public class APIzator2623292 {

  public static String[] takeInput() {
    List<String> list = new ArrayList<String>();
    Scanner stdin = new Scanner(System.in);
    do {
      System.out.println("Current list is " + list);
      System.out.println("Add more? (y/n)");
      if (stdin.next().startsWith("y")) {
        System.out.println("Enter : ");
        list.add(stdin.next());
      } else {
        break;
      }
    } while (true);
    stdin.close();
    System.out.println("List is " + list);
    String[] arr = list.toArray(new String[0]);
    return arr;
  }
}
