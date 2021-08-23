package com.stackoverflow.api;

/**
 * Java gotoxy(x,y) for console applications
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1001368">https://stackoverflow.com/a/1001368</a>
 */
public class APIzator1001368 {

  public static void gotoxyx(char escCode, int row, int column)
    throws Exception {
    System.out.print(String.format("%c[%d;%df", escCode, row, column));
  }
}
