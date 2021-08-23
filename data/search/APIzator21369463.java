package com.stackoverflow.api;

/**
 * Write a program to find remainder of dividing two numbers, without using % operator? In Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21369463">https://stackoverflow.com/a/21369463</a>
 */
public class APIzator21369463 {

  public static int writeProgram(int a, int b) {
    int c = a % b;
    int d = a - (a / b) * b;
    System.out.println(c);
    return d;
  }
}
