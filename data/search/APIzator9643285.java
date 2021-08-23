package com.stackoverflow.api;

import java.io.File;
import javax.activation.MimetypesFileTypeMap;

/**
 * Test if a file is an image file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9643285">https://stackoverflow.com/a/9643285</a>
 */
public class APIzator9643285 {

  public static void test(String filepath) {
    File f = new File(filepath);
    String mimetype = new MimetypesFileTypeMap().getContentType(f);
    String type = mimetype.split("/")[0];
    if (type.equals("image")) System.out.println(
      "It's an image"
    ); else System.out.println("It's NOT an image");
  }
}
