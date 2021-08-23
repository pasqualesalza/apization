package com.stackoverflow.api;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * How do I resize an imageview image in javafx?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27894962">https://stackoverflow.com/a/27894962</a>
 */
public class APIzator27894962 {

  public static Image resizeImage() throws Exception {
    ImageView imageView = new ImageView("...");
    imageView.setFitHeight(100);
    imageView.setFitWidth(100);
    imageView.setPreserveRatio(true);
    return new Image("my/res/flower.png", 100, 100, false, false);
  }
}
