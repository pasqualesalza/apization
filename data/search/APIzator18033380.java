package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Arraylist containing Integers and Strings
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18033380">https://stackoverflow.com/a/18033380</a>
 */
public class APIzator18033380 {

  public static void arraylist(Map<String, List> mapOfLists)
    throws Exception {
    List<List> listOfMixedTypes = new ArrayList<List>();
    ArrayList<String> listOfStrings = new ArrayList<String>();
    ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
    listOfMixedTypes.add(listOfStrings);
    listOfMixedTypes.add(listOfIntegers);
    mapOfLists.get("strings").add("value");
    mapOfLists.get("integers").add(new Integer(10));
  }
}
