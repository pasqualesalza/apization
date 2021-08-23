package com.stackoverflow.api;

import java.util.Scanner;

/**
 * Writing a Java program that converts an English word into PigLatin
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22420264">https://stackoverflow.com/a/22420264</a>
 */
public class APIzator22420264 {

  public static void writeProgram() {
    Scanner sc = new Scanner(System.in);
    final String vowels = "aeiouAEIOU";
    System.out.println("Enter your word.");
    String word = sc.nextLine();
    while (!word.equalsIgnoreCase("done")) {
      String beforVowel = "";
      int cut = 0;
      while (cut < word.length() && !vowels.contains("" + word.charAt(cut))) {
        beforVowel += word.charAt(cut);
        cut++;
      }
      if (cut == 0) {
        cut = 1;
        word += word.charAt(0) + "w";
      }
      System.out.println(word.substring(cut) + beforVowel + "ay");
      System.out.println("Enter your word.");
      word = sc.nextLine();
    }
  }
}
