package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * How can I store numbers into array every time I input a new number from keyboard (java)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8768571">https://stackoverflow.com/a/8768571</a>
 */
public class APIzator8768571 {

  public static void storeNumber() throws Exception {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<Integer>();
    int check = 0;
    while (true) {
      check = input.nextInt();
      if (check == 0) break;
      al.add(check);
    }
    for (int i : al) {
      System.out.print(i);
    }
  }
}
