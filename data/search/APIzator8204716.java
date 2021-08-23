package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java regex email
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8204716">https://stackoverflow.com/a/8204716</a>
 */
public class APIzator8204716 {

  public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile(
    "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
    Pattern.CASE_INSENSITIVE
  );

  public static boolean validate(String emailStr) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
    return matcher.find();
  }
}
