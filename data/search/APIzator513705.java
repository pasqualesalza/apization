package com.stackoverflow.api;

import java.io.*;
import java.util.Date;

/**
 * Should I use Java's String.format() if performance is important?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/513705">https://stackoverflow.com/a/513705</a>
 */
public class APIzator513705 {

  public static long useStringformat() {
    int i = 0;
    long prev_time = System.currentTimeMillis();
    long time;
    for (i = 0; i < 100000; i++) {
      String s = "Blah" + i + "Blah";
    }
    time = System.currentTimeMillis() - prev_time;
    System.out.println("Time after for loop " + time);
    prev_time = System.currentTimeMillis();
    for (i = 0; i < 100000; i++) {
      String s = String.format("Blah %d Blah", i);
    }
    time = System.currentTimeMillis() - prev_time;
    return time;
  }
}
