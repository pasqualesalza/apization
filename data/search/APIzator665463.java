package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 * Is there any good and free Date AND Time Picker available for Java Swing?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/665463">https://stackoverflow.com/a/665463</a>
 */
public class APIzator665463 {

  public static void be() throws Exception {
    JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
    JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(
      timeSpinner,
      "HH:mm:ss"
    );
    timeSpinner.setEditor(timeEditor);
    // will only show the current time
    timeSpinner.setValue(new Date());
  }
}
