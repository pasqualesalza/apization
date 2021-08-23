package com.stackoverflow.api;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 * How to convert string to xml file in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3888207">https://stackoverflow.com/a/3888207</a>
 */
public class APIzator3888207 {

  public static Document stringToDom(String xmlSource)
    throws SAXException, ParserConfigurationException, IOException {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    return builder.parse(new InputSource(new StringReader(xmlSource)));
  }
}
