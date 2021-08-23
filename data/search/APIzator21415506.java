package com.stackoverflow.api;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Document;

/**
 * Convert an XML file to CSV file using java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21415506">https://stackoverflow.com/a/21415506</a>
 */
public class APIzator21415506 {

  public static void convertFile() throws Exception {
    File stylesheet = new File("src/main/resources/style.xsl");
    File xmlSource = new File("src/main/resources/data.xml");
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(xmlSource);
    StreamSource stylesource = new StreamSource(stylesheet);
    Transformer transformer = TransformerFactory
      .newInstance()
      .newTransformer(stylesource);
    Source source = new DOMSource(document);
    Result outputTarget = new StreamResult(new File("/tmp/x.csv"));
    transformer.transform(source, outputTarget);
  }
}
