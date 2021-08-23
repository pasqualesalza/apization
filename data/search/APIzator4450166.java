package com.stackoverflow.api;

import android.net.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Difference between matches() and find() in Java Regex
 *
 * classpath: android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4450166">https://stackoverflow.com/a/4450166</a>
 */
public class APIzator4450166 {

  public static boolean difference() throws ParseException {
    Pattern p = Pattern.compile("\\d\\d\\d");
    Matcher m = p.matcher("a123b");
    System.out.println(m.find());
    System.out.println(m.matches());
    p = Pattern.compile("^\\d\\d\\d$");
    m = p.matcher("123");
    System.out.println(m.find());
    return m.matches();
  }
  /* output:
true
false
true
true
*/
}
