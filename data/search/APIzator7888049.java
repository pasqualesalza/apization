package com.stackoverflow.api;

/**
 * How do I print escape characters in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7888049">https://stackoverflow.com/a/7888049</a>
 */
public class APIzator7888049 {

  public static String unEscapeString(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) switch (s.charAt(i)) {
      case '\n':
        sb.append("\\n");
        break;
      case '\t':
        sb.append("\\t");
        break;
      // ... rest of escape characters
      default:
        sb.append(s.charAt(i));
    }
    return sb.toString();
  }
}
