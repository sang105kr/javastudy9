package com.kh.exam5;

public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    changeData(x,y);
    System.out.println("x = "+x);  // 10 or 30
    System.out.println("y = "+y);  // 20 or 40

    System.out.println("============");
    int[] r = changeData2(x,y);
    x = r[0];
    y = r[1];
    System.out.println("x = "+x);  // 10 or 30
    System.out.println("y = "+y);  // 20 or 40

    System.out.println("============");
    int[] k = new int[2];
    k[0] = 10;
    k[1] = 20;
    changeArray(k);
    System.out.println("k[0] = "+k[0]); // 10 or 30
    System.out.println("k[1] = "+k[1]); // 20 or 40
  }

  public static void changeData(int x, int y) {
    x = 30;
    y = 40;
  }
  public static int[] changeData2(int x, int y) {
    int[] r = new int[2];
    r[0] = 30;
    r[1] = 40;
    return r;
  }

  public static void changeArray(int[] k){
    k[0] = 30;
    k[1] = 40;
  }
}
