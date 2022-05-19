package com.kh.exam1;

public class Exam1Main3 {
  public static void main(String[] args) throws Exception {
    Calculator c1 = new Calculator("검정","Korea");
    c1.powerOn();
    c1.plus(10,20);
    System.out.println(c1.getResult());

    Calculator c2 = new Calculator("빨강","China");
    c2.powerOn();
    c2.minus(30,10);
    System.out.println(c2.getResult());

    Calculator[] arr = new Calculator[2];
    arr[0] = c1;
    arr[1] = c2;

    for(Calculator cal : arr){
      System.out.println(cal.getColor());
      System.out.println(cal.getMaker());
    }
  }
}
