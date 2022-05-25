package com.kh.exercise12.q8;

interface A {
  default void abc(){
    System.out.println("A인터페이스의 이름은 abc");
  }

  static void def(){
    System.out.println("A인터페이스의 정적 메소드");
  }
}
