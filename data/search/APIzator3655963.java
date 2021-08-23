package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.text.StrSubstitutor;

/**
 * String replacement in java, similar to a velocity template
 *
 * classpath: commons-lang-2.6
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3655963">https://stackoverflow.com/a/3655963</a>
 */
public class APIzator3655963 {

  public static String replacement(
    Map<String, String> valuesMap,
    String templateString
  ) throws Exception {
    StrSubstitutor sub = new StrSubstitutor(valuesMap);
    return sub.replace(templateString);
  }
}
