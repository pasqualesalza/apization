package com.stackoverflow.api;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * write newline into a file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8491808">https://stackoverflow.com/a/8491808</a>
 */
public class APIzator8491808 {

  public static void writeNewline(String nodeValue) throws Exception {
    // you want to output to file
    // BufferedWriter writer = new BufferedWriter(new FileWriter(file3, true));
    // but let's print to console while debugging
    BufferedWriter writer = new BufferedWriter(
      new OutputStreamWriter(System.out)
    );
    String[] words = nodeValue.split(" ");
    for (String word : words) {
      writer.write(word);
      writer.newLine();
    }
    writer.close();
  }
}
