package com.stackoverflow.api;

import java.util.Scanner;

/**
 * Is there a way that i can loop this program to start all over again after it executes part of a loop
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11775529">https://stackoverflow.com/a/11775529</a>
 */
public class APIzator11775529 {

  public static void be() {
    boolean run = true;
    while (run) {
      Scanner input = new Scanner(System.in);
      int ans;
      System.out.println("Choose an option");
      System.out.print(
        "1: To see members\n2: To add member\n3: To delete a member\n4: To end the program\n Option: "
      );
      ans = input.nextInt();
      switch (ans) {
        case 1:
          // code to see members
          break;
        case 2:
          // code to add members
          break;
        case 3:
          // code to delete members
          break;
        case 4:
          // it will end the program
          run = false;
          break;
        default:
          System.out.println("Invalid option");
      }
    }
  }
}
