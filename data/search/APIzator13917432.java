package com.stackoverflow.api;

import org.easymock.EasyMock;

/**
 * EasyMock expectations with void methods
 *
 * classpath: easymock-4.0.1
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13917432">https://stackoverflow.com/a/13917432</a>
 */
public class APIzator13917432 {

  public static void expectation() throws Exception {
    EasyMock.expectLastCall().once();
    EasyMock.expectLastCall().atLeastOnce();
    EasyMock.expectLastCall().anyTimes();
  }
}
