package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java Arraylist to store user input
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4456018">https://stackoverflow.com/a/4456018</a>
 */
public class APIzator4456018 {

  public static void arraylist() {
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Integer> phone = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Please enter your name: ");
      name.add(sc.next());
      System.out.println("Please enter your number: ");
      phone.add(sc.nextInt());
    }
  }
}
