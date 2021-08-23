package com.stackoverflow.api;

import java.security.Permission;

/**
 * How does Java's System.exit() work with try/catch/finally blocks?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1410961">https://stackoverflow.com/a/1410961</a>
 */
public class APIzator1410961 {

  public static void block() throws Exception {
    System.setSecurityManager(
      new SecurityManager() {
        @Override
        public void checkPermission(Permission perm) {
          /* Allow everything else. */
        }

        @Override
        public void checkExit(int status) {
          /* Don't allow exit with any status code. */
          throw new SecurityException();
        }
      }
    );
    System.err.println("I'm dying!");
    try {
      System.exit(0);
    } finally {
      System.err.println("I'm not dead yet!");
      System.exit(1);
    }
  }
}
