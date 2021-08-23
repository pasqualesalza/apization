package com.stackoverflow.api;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * How to create a JavaFX dialog?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14168238">https://stackoverflow.com/a/14168238</a>
 */
public class APIzator14168238 {

  public static void createDialog() throws Exception {
    Stage dialog = new Stage();
    dialog.initStyle(StageStyle.UTILITY);
    Scene scene = new Scene(new Group(new Text(25, 25, "Hello World!")));
    dialog.setScene(scene);
    dialog.show();
  }
}
