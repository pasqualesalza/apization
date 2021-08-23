package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * Performance of StringTokenizer class vs. String.split method in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5965814">https://stackoverflow.com/a/5965814</a>
 */
public class APIzator5965814 {

  public static void performance(int runs) throws Exception {
    StringBuilder sb = new StringBuilder();
    for (int i = 100000; i < 100000 + 60; i++) sb.append(i).append(' ');
    String sample = sb.toString();
    for (int i = 0; i < 5; i++) {
      {
        long start = System.nanoTime();
        for (int r = 0; r < runs; r++) {
          StringTokenizer st = new StringTokenizer(sample);
          List<String> list = new ArrayList<String>();
          while (st.hasMoreTokens()) list.add(st.nextToken());
        }
        long time = System.nanoTime() - start;
        System.out.printf(
          "StringTokenizer took an average of %.1f us%n",
          time / runs / 1000.0
        );
      }
      {
        long start = System.nanoTime();
        Pattern spacePattern = Pattern.compile(" ");
        for (int r = 0; r < runs; r++) {
          List<String> list = Arrays.asList(spacePattern.split(sample, 0));
        }
        long time = System.nanoTime() - start;
        System.out.printf(
          "Pattern.split took an average of %.1f us%n",
          time / runs / 1000.0
        );
      }
      {
        long start = System.nanoTime();
        for (int r = 0; r < runs; r++) {
          List<String> list = new ArrayList<String>();
          int pos = 0, end;
          while ((end = sample.indexOf(' ', pos)) >= 0) {
            list.add(sample.substring(pos, end));
            pos = end + 1;
          }
        }
        long time = System.nanoTime() - start;
        System.out.printf(
          "indexOf loop took an average of %.1f us%n",
          time / runs / 1000.0
        );
      }
    }
  }
}
