package com.stackoverflow.api;

import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;

/**
 * Regular Expressions and GWT
 *
 * classpath: gwt-user-2.8.2
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7873038">https://stackoverflow.com/a/7873038</a>
 */
public class APIzator7873038 {

  public static void expressions(String patternStr, String inputStr)
    throws Exception {
    // Compile and use regular expression
    RegExp regExp = RegExp.compile(patternStr);
    MatchResult matcher = regExp.exec(inputStr);
    // equivalent to regExp.test(inputStr);
    boolean matchFound = matcher != null;
    if (matchFound) {
      // Get all groups for this match
      for (int i = 0; i < matcher.getGroupCount(); i++) {
        String groupStr = matcher.getGroup(i);
        System.out.println(groupStr);
      }
    }
  }
}
