package com.stackoverflow.api;

import android.os.AsyncTask;

/**
 * Extending AsyncTask<Void, Void, Void>
 *
 * classpath: android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11194873">https://stackoverflow.com/a/11194873</a>
 */
public class APIzator11194873 {

  public static void extendingVoid() throws Exception {
    new AsyncTask<Integer, Void, Void>() {
      @Override
      protected Void doInBackground(Integer... params) {
        // **Code**
        return null;
      }
    }
    .execute(1, 2, 3, 4, 5);
  }
}
