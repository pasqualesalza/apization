package com.stackoverflow.api;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFrame;

/**
 * java.util.MissingResourceException: Can't find bundle for base name
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3383237">https://stackoverflow.com/a/3383237</a>
 */
public class APIzator3383237 {

  public static String javautil() {
    Locale currentLocale;
    ResourceBundle messages;
    currentLocale = new Locale("es");
    messages = ResourceBundle.getBundle("resources.Messages", currentLocale);
    System.out.println(messages.getString("Messagesgreetings"));
    System.out.println(messages.getString("Messagesinquiry"));
    return messages.getString("Messagesfarewell");
  }
}
