package com.stackoverflow.api;

/**
 * How to type ":" ("colon") in regexp?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6579976">https://stackoverflow.com/a/6579976</a>
 */
public class APIzator6579976 {

  public static boolean type() {
    // true: '8' is in the range ','..':'
    System.out.println("8:".matches("[,-:]+"));
    // false: '8' does not match ',' or ':' or '-'
    System.out.println("8:".matches("[,:-]+"));
    return ",,-,:,:".matches("[,:-]+");
  }
}
