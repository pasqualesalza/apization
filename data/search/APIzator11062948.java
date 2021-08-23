package com.stackoverflow.api;

/**
 * Java error "Value of local variable is not used"
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11062948">https://stackoverflow.com/a/11062948</a>
 */
public class APIzator11062948 {

  public static void use() {
    try {
      Runtime rt = Runtime.getRuntime();
      Process p = rt.exec("calc.exe");
    } catch (Exception exc) {
      /*handle exception*/
    }
  }
}
