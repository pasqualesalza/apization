package com.stackoverflow.api;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/**
 * Get the string value from List<String> through loop for display
 *
 * classpath: android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11502432">https://stackoverflow.com/a/11502432</a>
 */
public class APIzator11502432 {

  public static void getValue(List<String> myString) throws Exception {
    // retrieving data from string list array in for loop
    for (int i = 0; i < myString.size(); i++) {
      Log.i("Value of element " + i, myString.get(i));
    }
    for (String value : myString) {
      Log.i("Value of element ", value);
    }
  }
}
