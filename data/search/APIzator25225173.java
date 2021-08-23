package com.stackoverflow.api;

/**
 * How to count uppercase and lowercase letters in a string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/25225173">https://stackoverflow.com/a/25225173</a>
 */
public class APIzator25225173 {

  public static void countLetter(String input) throws Exception {
    int lowerCase = 0;
    int upperCase = 0;
    for (int k = 0; k < input.length(); k++) {
      /**
       * The methods isUpperCase(char ch) and isLowerCase(char ch) of the Character
       * class are static so we use the Class.method() format; the charAt(int index)
       * method of the String class is an instance method, so the instance, which,
       * in this case, is the variable `input`, needs to be used to call the method.
       */
      // Check for uppercase letters.
      if (Character.isUpperCase(input.charAt(k))) upperCase++;
      // Check for lowercase letters.
      if (Character.isLowerCase(input.charAt(k))) lowerCase++;
    }
    System.out.printf(
      "There are %d uppercase letters and %d lowercase letters.",
      upperCase,
      lowerCase
    );
  }
}
