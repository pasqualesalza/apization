package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to get the string after last comma in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9515546">https://stackoverflow.com/a/9515546</a>
 */
public class APIzator9515546 {

  public static void getString() throws Exception {
    Pattern p = Pattern.compile(".*,\\s*(.*)");
    Matcher m = p.matcher("abcd,fg;ijkl, cas");
    if (m.find()) System.out.println(m.group(1));
  }
}
