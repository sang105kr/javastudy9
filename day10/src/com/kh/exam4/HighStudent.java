package com.kh.exam4;

public class HighStudent extends Student{

  @Override
  public void eat() {
    super.eat();
    System.out.println("영양제도 먹다");
  }
}
