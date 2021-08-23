package com.stackoverflow.api;

import java.io.*;

/**
 * Running a shell script from java code
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/30623226">https://stackoverflow.com/a/30623226</a>
 */
public class APIzator30623226 {

  public static void runScript() throws Exception {
    try {
      String target = new String("/home/hagrawal/test.sh");
      // String target = new String("mkdir stackOver");
      Runtime rt = Runtime.getRuntime();
      Process proc = rt.exec(target);
      proc.waitFor();
      StringBuffer output = new StringBuffer();
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(proc.getInputStream())
      );
      String line = "";
      while ((line = reader.readLine()) != null) {
        output.append(line + "\n");
      }
      System.out.println("### " + output);
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }
}
