package com.stackoverflow.api;

/**
 * "Content is not allowed in prolog" when parsing perfectly valid XML on GAE
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3030913">https://stackoverflow.com/a/3030913</a>
 */
public class APIzator3030913 {

  public static void allow(String xml) throws Exception {
    xml = xml.trim().replaceFirst("^([\\W]+)<", "<");
  }
}
