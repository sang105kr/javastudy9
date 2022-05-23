package com.kh.exam2;

public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int result = sum(10,20);

    Main main = new Main();
    main.sum2(x,y);
  }

  private static int sum(int num1, int num2) {
    int result = 0;
    result = num1 + num2;
    return result;
  }

  private int sum2(int x, int y){
    return x+y;
  }
}
