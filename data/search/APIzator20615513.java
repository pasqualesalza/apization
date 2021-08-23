package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Set all values of ArrayList<Boolean> to false on instantiation
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20615513">https://stackoverflow.com/a/20615513</a>
 */
public class APIzator20615513 {

  public static void setValue() throws Exception {
    List<Boolean> list = new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
    Collections.fill(list, Boolean.TRUE);
  }
}
