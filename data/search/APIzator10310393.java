package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.common.base.CaseFormat;

/**
 * Regex for converting CamelCase to camel_case in java
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10310393">https://stackoverflow.com/a/10310393</a>
 */
public class APIzator10310393 {

  public static void regex() throws Exception {
    CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "SomeInput");
  }
}
