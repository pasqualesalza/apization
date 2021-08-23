package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How can I convert String[] to ArrayList<String>
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10231040">https://stackoverflow.com/a/10231040</a>
 */
public class APIzator10231040 {

  public static List<String> convertString(String[] strings)
    throws Exception {
    return new ArrayList<String>(Arrays.asList(strings));
  }
}
