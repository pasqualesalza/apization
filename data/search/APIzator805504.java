package com.stackoverflow.api;

import org.apache.tools.ant.DirectoryScanner;

/**
 * How to find files that match a wildcard string in Java?
 *
 * classpath: ant-1.10.5
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/805504">https://stackoverflow.com/a/805504</a>
 */
public class APIzator805504 {

  public static String[] findFile() throws Exception {
    DirectoryScanner scanner = new DirectoryScanner();
    scanner.setIncludes(new String[] { "**/*.java" });
    scanner.setBasedir("C:/Temp");
    scanner.setCaseSensitive(false);
    scanner.scan();
    return scanner.getIncludedFiles();
  }
}
