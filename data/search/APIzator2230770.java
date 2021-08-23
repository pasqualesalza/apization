package com.stackoverflow.api;

import org.apache.commons.validator.UrlValidator;

/**
 * How to check for a valid URL in Java?
 *
 * classpath: commons-validator-1.6
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2230770">https://stackoverflow.com/a/2230770</a>
 */
public class APIzator2230770 {

  public static void check() throws Exception {
    UrlValidator urlValidator = new UrlValidator();
    urlValidator.isValid("http://my favorite site!");
  }
}
