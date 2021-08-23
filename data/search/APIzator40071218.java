package com.stackoverflow.api;

import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * How to use OKHTTP to make a post request?
 *
 * classpath: okhttp-3.11.0
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/40071218">https://stackoverflow.com/a/40071218</a>
 */
public class APIzator40071218 {

  public static Request useOkhttp(String BASE_URL, int route)
    throws Exception {
    RequestBody requestBody = new MultipartBody.Builder()
      .setType(MultipartBody.FORM)
      .addFormDataPart("somParam", "someValue")
      .build();
    return new Request.Builder()
      .url(BASE_URL + route)
      .post(requestBody)
      .build();
  }
}
