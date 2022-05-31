package com.kh.excercise17.q5;

public class Main {
  public static void main(String[] args) {
    Data data1 = new Data(3);
    Data data2 = new Data(3);
    System.out.println(data1==data2);
    System.out.println(data1.equals(data2));
    System.out.println(data1.hashCode()==data2.hashCode());
  }
}
