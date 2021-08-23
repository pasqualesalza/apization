package com.stackoverflow.api;

import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/**
 * Using HttpClient and HttpPost in Android with post parameters
 *
 * classpath: httpcore-4.4.10:httpclient-4.5.6:android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6029205">https://stackoverflow.com/a/6029205</a>
 */
public class APIzator6029205 {

  public static void useHttpclient(
    String lastupdate,
    String connection,
    ArrayList<NameValuePair> nameValuePairs
  ) throws Exception {
    InputStream is = null;
    try {
      HttpClient httpclient = new DefaultHttpClient();
      HttpPost httppost = new HttpPost(connection);
      httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
      HttpResponse response = httpclient.execute(httppost);
      HttpEntity entity = response.getEntity();
      is = entity.getContent();
      Log.d("HTTP", "HTTP: OK");
    } catch (Exception e) {
      Log.e("HTTP", "Error in http connection " + e.toString());
    }
  }
}
