package com.stackoverflow.api;

import java.io.*;

/**
 * Find duplicate characters in a String and count the number of occurances using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13119986">https://stackoverflow.com/a/13119986</a>
 */
public class APIzator13119986 {

  public static void findCharacter() throws IOException {
    String ch;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the Statement:");
    ch = br.readLine();
    int count = 0, len = 0;
    do {
      try {
        char[] name = ch.toCharArray();
        len = name.length;
        count = 0;
        for (int j = 0; j < len; j++) {
          if (
            (name[0] == name[j]) &&
            (
              (name[0] >= 65 && name[0] <= 91) ||
              (name[0] >= 97 && name[0] <= 123)
            )
          ) count++;
        }
        if (count != 0) System.out.println(name[0] + " " + count + " Times");
        ch = ch.replace("" + name[0], "");
      } catch (Exception ex) {}
    } while (len != 1);
  }
}
