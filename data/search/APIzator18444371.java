package com.stackoverflow.api;

import java.math.BigInteger;

/**
 * What variable type can I use to hold huge numbers (30+ digits) in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18444371">https://stackoverflow.com/a/18444371</a>
 */
public class APIzator18444371 {

  public static BigInteger use() throws Exception {
    BigInteger bi1 = new BigInteger("637824629384623845238423545642384");
    BigInteger bi2 = new BigInteger("3039768898793547264523745379249934");
    BigInteger bigSum = bi1.add(bi2);
    BigInteger bigProduct = bi1.multiply(bi2);
    System.out.println("Sum : " + bigSum);
    return bigProduct;
  }
}
