package com.kh.excercise17.q6;

public class Test {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    int sum = sum(x, y);
    int sum2 = sum(10, 20, 30);
    int sum3 = sum(1,2,3,4,5);
    System.out.printf("%d\t%d\t%d",sum,sum2,sum3);
  }

//  private static int sum(int i, int i1, int i2) {
//    return i + i1 +i2;
//  }
//
//  private static int sum(int x, int y) {
//    return x+y;
//  }

  //가변 매개변수 선언 : 타입 + ...
  //가변 매개변수는 메소드 바디내에서 배열로 사용된다.
  //가변 매개변수는 매개변수가 여러개 있을 경우 마지막에 위치해야한다.
  private static int sum(int... num){
    int result = 0;
    for (int i = 0; i < num.length; i++) {
      result += num[i];
    }
    return result;
  }

  private static int sum(double x, int... num){
    int result = 0;
    for (int i = 0; i < num.length; i++) {
      result += num[i];
    }
    return result;
  }
}
