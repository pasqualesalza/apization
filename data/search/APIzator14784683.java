package com.stackoverflow.api;

import java.util.Scanner;

/**
 * Converting Decimal to Binary Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14784683">https://stackoverflow.com/a/14784683</a>
 */
public class APIzator14784683 {

  public static void convertDecimal() {
    int number;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a positive integer");
    number = in.nextInt();
    if (number < 0) {
      System.out.println("Error: Not a positive integer");
    } else {
      System.out.print("Convert to binary is:");
      // System.out.print(binaryform(number));
      printBinaryform(number);
    }
  }

  private static void printBinaryform(int number) {
    int remainder;
    if (number <= 1) {
      System.out.print(number);
      // KICK OUT OF THE RECURSION
      return;
    }
    remainder = number % 2;
    printBinaryform(number >> 1);
    System.out.print(remainder);
  }
}
