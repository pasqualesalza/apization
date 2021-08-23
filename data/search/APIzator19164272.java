package com.stackoverflow.api;

/**
 * Count letters in a string Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19164272">https://stackoverflow.com/a/19164272</a>
 */
public class APIzator19164272 {

  public static void letter(String userInput) throws Exception {
    // Make your input toLowerCase.
    String input = userInput.toLowerCase();
    int[] alphabetArray = new int[26];
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      int value = (int) ch;
      if (value >= 97 && value <= 122) {
        alphabetArray[ch - 'a']++;
      }
    }
    for (int i = 0; i < alphabetArray.length; i++) {
      if (alphabetArray[i] > 0) {
        char ch = (char) (i + 97);
        // Show the result.
        System.out.println(ch + "  : " + alphabetArray[i]);
      }
    }
  }
}
