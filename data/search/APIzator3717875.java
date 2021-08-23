package com.stackoverflow.api;

import java.io.File;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import org.w3c.dom.*;

/**
 * Remove XML Node using java parser
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3717875">https://stackoverflow.com/a/3717875</a>
 */
public class APIzator3717875 {

  public static void removeNode() throws Exception {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    Document document = dbf.newDocumentBuilder().parse(new File("input.xml"));
    XPathFactory xpf = XPathFactory.newInstance();
    XPath xpath = xpf.newXPath();
    XPathExpression expression = xpath.compile("//A/B[C/E/text()=13]");
    Node b13Node = (Node) expression.evaluate(document, XPathConstants.NODE);
    b13Node.getParentNode().removeChild(b13Node);
    TransformerFactory tf = TransformerFactory.newInstance();
    Transformer t = tf.newTransformer();
    t.transform(new DOMSource(document), new StreamResult(System.out));
  }
}
