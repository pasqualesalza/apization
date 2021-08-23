package com.stackoverflow.api;

import java.util.Scanner;

/**
 * How to Read Strings from Scanner in console Application JAVA?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17691245">https://stackoverflow.com/a/17691245</a>
 */
public class APIzator17691245 {

  public static void readStrings() {
    Scanner scanner = new Scanner(System.in);
    int eid, sid;
    String ename;
    System.out.println("Enter Employeeid:");
    eid = scanner.nextInt();
    // This is needed to pick up the new line
    scanner.nextLine();
    System.out.println("Enter EmployeeName:");
    ename = scanner.nextLine();
    System.out.println("Enter SupervisiorId:");
    sid = (scanner.nextInt());
  }
}
