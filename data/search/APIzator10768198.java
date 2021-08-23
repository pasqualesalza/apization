package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How do I declare a 2D String arraylist?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10768198">https://stackoverflow.com/a/10768198</a>
 */
public class APIzator10768198 {

  public static String declareArraylist(List<String> x)
    throws Exception {
    List<List<String>> ls2d = new ArrayList<List<String>>();
    ls2d.add(x);
    return Arrays.deepToString(ls2d.toArray());
  }
}
