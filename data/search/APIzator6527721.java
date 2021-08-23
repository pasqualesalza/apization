package com.stackoverflow.api;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

/**
 * How do you upload a file to an FTP server?
 *
 * classpath: commons-net-3.6
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6527721">https://stackoverflow.com/a/6527721</a>
 */
public class APIzator6527721 {

  public static void uploadFile(String filename) throws Exception {
    FTPClient client = new FTPClient();
    FileInputStream fis = null;
    try {
      client.connect("ftp.domain.com");
      client.login("admin", "secret");
      //
      // Create an InputStream of the file to be uploaded
      fis = new FileInputStream(filename);
      //
      // Store file to server
      //
      client.storeFile(filename, fis);
      client.logout();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fis != null) {
          fis.close();
        }
        client.disconnect();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
