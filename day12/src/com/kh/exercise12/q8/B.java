package com.kh.exercise12.q8;

class B implements A{
  @Override
  public void abc() {
    A.super.abc(); // default메소드 호출
    A.def();       // static메소드 호출
    System.out.println("B 클래스의 abc()");
  }
}
