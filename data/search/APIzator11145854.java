package com.stackoverflow.api;

/**
 * How to convert a string with Unicode encoding to a string of letters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11145854">https://stackoverflow.com/a/11145854</a>
 */
public class APIzator11145854 {

  public static void convertString(String myString) throws Exception {
    String str = myString.split(" ")[0];
    str = str.replace("\\", "");
    String[] arr = str.split("u");
    String text = "";
    for (int i = 1; i < arr.length; i++) {
      int hexVal = Integer.parseInt(arr[i], 16);
      text += (char) hexVal;
    }
    // Text will now have Hello
  }
}
