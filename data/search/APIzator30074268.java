package com.stackoverflow.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Java - Writing strings to a CSV file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/30074268">https://stackoverflow.com/a/30074268</a>
 */
public class APIzator30074268 {

  public static void string(StringBuilder sb) throws FileNotFoundException {
    PrintWriter pw = new PrintWriter(new File("test.csv"));
    pw.write(sb.toString());
    pw.close();
    System.out.println("done!");
  }
}
