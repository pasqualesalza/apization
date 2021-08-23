package com.stackoverflow.api;

import java.util.Scanner;

/**
 * Write an application that inputs three integers from the user and displays the sum, average, product, smallest and largest of the numbers
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/25675471">https://stackoverflow.com/a/25675471</a>
 */
public class APIzator25675471 {

  public static void writeApplication() {
    Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    int sum;
    int average;
    int product;
    int largest;
    int smallest;
    System.out.print("Enter First Integer: ");
    num1 = input.nextInt();
    System.out.print("Enter Second Integer: ");
    num2 = input.nextInt();
    System.out.print("Enter Third Integer: ");
    num3 = input.nextInt();
    sum = num1 + num2 + num3;
    average = sum / 3;
    product = num1 * num2 * num3;
    largest = num1;
    smallest = num1;
    if (num2 > largest) largest = num2;
    if (num3 > largest) largest = num3;
    if (num2 < smallest) smallest = num2;
    if (num3 < smallest) smallest = num3;
    System.out.println("The sum is " + sum);
    System.out.println("The average is " + average);
    System.out.println("The product is " + product);
    System.out.println(
      "Largest of three integers is " +
      largest +
      " and the smallest is " +
      smallest +
      "."
    );
  }
}
