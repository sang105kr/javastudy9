package com.kh.exam1;

public class Main3 {
  public static void main(String[] args) {

    try {
      method1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static void method1() throws Exception {
    int[] arr = new int[3];
    arr[3] = 10;
  }
}
